package com.sap.ide.cts.editor.prettyprint;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.Token;
import org.eclipse.jface.text.rules.EndOfLineRule;

import tcs.ClassTemplate;
import tcs.ContextTemplate;
import tcs.OrPattern;
import tcs.Rule;
import tcs.RulePattern;
import tcs.SequenceElement;
import tcs.SimplePattern;
import tcs.Template;
import tcs.__impl.EndOfLineRuleWrapper;
import tcs.__impl.MultiLineRuleWrapper;
import textblockdefinition.TextBlockDefinition;
import textblocks.AbstractToken;
import textblocks.Bostoken;
import textblocks.Eostoken;
import textblocks.LexedToken;
import textblocks.OmittedToken;
import textblocks.TextBlock;
import textblocks.TextblocksPackage;
import textblocks.VersionEnum;

import com.sap.ide.cts.editor.contentassist.TcsDebugUtil;
import com.sap.ide.cts.editor.prettyprint.imported.PrettyPrinter;
import com.sap.ide.cts.editor.prettyprint.imported.TCSExtractorStream;
import com.sap.ide.cts.moin.parserfactory.AbstractParserFactory;
import com.sap.ide.cts.parser.incremental.antlr.ANTLRIncrementalLexerAdapter;
import com.sap.mi.textual.grammar.impl.ObservableInjectingParser;
import com.sap.mi.textual.parsing.textblocks.TbMarkingUtil;
import com.sap.mi.textual.parsing.textblocks.TbNavigationUtil;
import com.sap.mi.textual.parsing.textblocks.TbValidationUtil;
import com.sap.mi.textual.tcs.util.TcsUtil;
import com.sap.tc.moin.repository.ModelPartition;
import com.sap.tc.moin.repository.mmi.reflect.RefObject;

/**
 * 
 * @author Philipp Meier, Andreas Landerer
 * 
 */
public class CtsTextBlockIncrementalTCSExtractorStream
		implements
			TCSExtractorStream {

	private static boolean debug = false;
	private int textBlocksHandleCounter = 0;
	private int commandId = 0;
	private Stack<Integer> openTextBlocksHandles = new Stack<Integer>();
	private TextBlock oldTextBlock = null;
	private ClassTemplate templateForOldTextBlock = null;
	private List<TextBlockCommand> current = new ArrayList<TextBlockCommand>();
	private Map<Integer, List<TextBlockCommand>> backup = new HashMap<Integer, List<TextBlockCommand>>();
	private int curBackupHandle = 0;
	private Stack<SequenceElement> currentSE = new Stack<SequenceElement>();
	private Map<TextBlock, Template> blockToTemplate = new HashMap<TextBlock, Template>();
	private PrettyPrinter prettyPrinter = null;
	private boolean formatMode = true;
	TextblocksPackage pack = null;
	ModelPartition part = null;
	TextBlock rootBlock = null;
	TextBlock curBlock = null;
	int curOffset = 0;
	int curBlockLength = 0;
	StringBuffer rootBlockCachedString = new StringBuffer();
	private final Lexer lexer;

	private final AbstractParserFactory<? extends ObservableInjectingParser, ? extends Lexer> pFactory;

	interface TextBlockCommand {
		void execute();
		int getId();
	}

	class AddNextTextBlockCommand implements TextBlockCommand {
		private RefObject object;
		private Template t;
		private SequenceElement se;
		private int handle;
		private int id;

		public AddNextTextBlockCommand(RefObject object, Template t,
				SequenceElement se, int handle) {
			this.object = object;
			this.t = t;
			this.se = se;
			this.handle = handle;
			this.id = CtsTextBlockIncrementalTCSExtractorStream.this.commandId++;
		}

		public void execute() {
			addNextTextBlock(object, t, se, handle);
		}

		@Override
		public int getId() {
			return this.id;
		}
	}

	class FinishTextBlockCommand implements TextBlockCommand {
		private int id;
		private int handle;

		public FinishTextBlockCommand(int handle) {
			this.id = CtsTextBlockIncrementalTCSExtractorStream.this.commandId++;
			this.handle = handle;
		}

		public void execute() {
			finishTextBlock(handle);
		}

		@Override
		public int getId() {
			return this.id;
		}
	}

	class AddNextTokenCommand implements TextBlockCommand {
		private int id;
		private String s;
		private SequenceElement se;
		private AbstractToken token;

		public AddNextTokenCommand(String s, SequenceElement se) {
			this.s = s;
			this.se = se;
			this.id = CtsTextBlockIncrementalTCSExtractorStream.this.commandId++;
		}

		public AddNextTokenCommand(AbstractToken token) {
			this.token = token;
			this.s = token.getValue();
		}

		public void execute() {
			if (this.token == null) {
				addNextToken(s, se);
			} else {
				this.token.setParentBlock(null);
				this.token.setOffset(curOffset);
				addToken(this.token);
				TbMarkingUtil.markTokenRelexed(this.token);
				rootBlockCachedString.append(this.s);
			}
		}

		@Override
		public int getId() {
			return this.id;
		}
	}

	public CtsTextBlockIncrementalTCSExtractorStream(
			TextblocksPackage pack,
			ModelPartition partitionForTextBlocks,
			AbstractParserFactory<? extends ObservableInjectingParser, ? extends Lexer> parserFactory,
			boolean formatMode) {
		this.pack = pack;
		part = partitionForTextBlocks;
		this.lexer = parserFactory.createLexer(null);
		this.pFactory = parserFactory;
		this.formatMode = formatMode;
	}

	public TextBlock getRootBlock() {
		return rootBlock;
	}

	TextBlock createTextBlock() {
		TextBlock b = (TextBlock) pack.getTextBlock()
				.refCreateInstanceInPartition(part);
		b.setChildrenChanged(false);
		b.setVersion(VersionEnum.REFERENCE);
		b.setRelexingNeeded(false);
		b.setStartRow(0);
		b.setStartColumn(0);
		b.setEndRow(0);
		b.setEndColumn(0);
		b.setOffset(0);
		b.setLength(0);
		b.setOffsetRelative(true);
		b.setComplete(true);
		b.setCachedString("");
		return b;
	}

	LexedToken createLexedToken(SequenceElement se) {
		// TODO compute lookahead and lookback using lexer!
		LexedToken t = (LexedToken) pack.getLexedToken()
				.refCreateInstanceInPartition(part);
		t.setChildrenChanged(false);
		t.setVersion(VersionEnum.REFERENCE);
		t.setRelexingNeeded(false);
		t.setStartRow(0);
		t.setStartColumn(0);
		t.setEndRow(0);
		t.setEndColumn(0);
		t.setOffset(0);
		t.setLength(0);
		t.setOffsetRelative(true);
		t.setValue("");
		t.setLookahead(2);
		t.setLookback(2);
		t.setState(0);
		t.setType(0);
		t.setSequenceElement(se);
		return t;
	}

	OmittedToken createOmittedToken() {
		// TODO compute lookahead and lookback using lexer!
		OmittedToken t = (OmittedToken) pack.getOmittedToken()
				.refCreateInstanceInPartition(part);
		t.setChildrenChanged(false);
		t.setVersion(VersionEnum.REFERENCE);
		t.setRelexingNeeded(false);
		t.setStartRow(0);
		t.setStartColumn(0);
		t.setEndRow(0);
		t.setEndColumn(0);
		t.setOffset(0);
		t.setLength(0);
		t.setOffsetRelative(true);
		t.setValue("");
		t.setLookahead(2);
		t.setLookback(2);
		t.setState(0);
		t.setType(0);
		return t;
	}

	void addNextTextBlock(RefObject correspondingModelElement,
			Template template, SequenceElement se, int handle) {
		if (debug) {
			System.out.println("adding TextBlock for template "
					+ TcsDebugUtil.prettyPrint(template) + " with handle: "
					+ handle);
		}

		openTextBlocksHandles.add(handle);

		if (rootBlock == null) {
			// first textBlock, special rootBlock handling
			rootBlock = createTextBlock();
			setType(rootBlock, template);
			rootBlock.setOffsetRelative(false);
			if (correspondingModelElement != null) {
				if (TcsUtil.isPropertyInit(se)) {
					// Add to referenced element if its a Property Init
					rootBlock.getReferencedElements().add(
							correspondingModelElement);
				} else {
					rootBlock.getCorrespondingModelElements().add(
							correspondingModelElement);
				}
			}
			rootBlock.setSequenceElement(se);
			curBlock = rootBlock;

			if (debug) {
				System.out.println("adding BosToken");
			}
			if (template instanceof ClassTemplate) {
				if (((ClassTemplate) template).isMain()) {
					addBosToken();
				}
			} else if (template == null) {
				if (curBlock.getParentBlock() == null) {
					addBosToken();
				}
			}
		} else {
			// not the rootBlock

			// backup curBlockLenght in curBlock.length
			curBlock.setLength(curBlockLength);

			TextBlock b = createTextBlock();
			b.setOffset(curOffset);

			if (correspondingModelElement != null) {
				if (TcsUtil.isPropertyInit(se)) {
					// Add to referenced element if its a Property Init
					b.getReferencedElements().add(correspondingModelElement);
				} else {
					b.getCorrespondingModelElements().add(
							correspondingModelElement);
				}
			}
			b.setSequenceElement(se);
			setType(b, template);
			addTextBlock(b);
		}

		// save Template for later use
		blockToTemplate.put(curBlock, template);
	}

	public void setPrettyPrinter(PrettyPrinter prettyPrinter) {
		this.prettyPrinter = prettyPrinter;
	}

	private void setType(TextBlock block, Template template) {
		if (template != null) {
			TextBlockDefinition tbDef = pack.getTextblockdefinition()
					.getTextblockDefinitionReferencesProduction()
					.getTextBlockDefinition(template).iterator().next();
			block.setType(tbDef);
		}
	}

	void addTextBlock(TextBlock b) {
		curBlock.getSubBlocks().add(b);

		curOffset = 0;
		curBlockLength = 0;

		curBlock = b;
	}

	void finishTextBlock(int handle) {
		if (debug) {
			System.out.println("finishing TextBlock with handle: " + handle);
		}

		while (openTextBlocksHandles.size() > 0
				&& openTextBlocksHandles.peek() != handle) {
			// calls to addTextBlock and finishTextBlock do not match
			// last textblock was falsely left open

			// gracefully close it
			if (debug) {
				System.out.println("closing left-open TextBlock with handle: "
						+ openTextBlocksHandles.peek());
			}
			finishTextBlock(openTextBlocksHandles.peek());
		}
		if (openTextBlocksHandles.size() > 0) {
			openTextBlocksHandles.pop();
		}

		curBlock.setLength(curBlockLength);

		TextBlock parent = curBlock.getParentBlock();
		if (parent != null) {

			if (curBlockLength == 0) {
				// this textblock is empty, remove it
				if (debug) {
					System.out.println("removing empty TextBlock");
				}

				// handle this textblock's addToContext flag
				// addToContext only present on ClassTemplate
				// context can be present on ClassTemplate and OperatorTemplate
				Template t = getType(curBlock);
				if (t instanceof ClassTemplate) {
					ClassTemplate ct = (ClassTemplate) t;
					if (ct.isAddToContext()) {
						addToParentContext(curBlock);
					}
				}

				parent.getSubBlocks().remove(curBlock);
				parent.getCorrespondingModelElements().addAll(
						curBlock.getCorrespondingModelElements());
				parent.getReferencedElements().addAll(
						curBlock.getReferencedElements());
				curBlock.refDelete();
			}

			// restore curBlockLength from parent and curBlockLength
			curBlockLength += parent.getLength();
			// restore curOffset from curBlockLength
			curOffset = curBlockLength;
			curBlock = parent;
		} else {
			// this is for the rootblock only
			if (curBlock.getTokens().size() > 0
					&& curBlock.getTokens().get(0) instanceof Bostoken) {
				// Ensure that no lookback is set for the first token.
				// TODO: Currently
				// the lookback for tokens created by the Extractor is hard
				// coded to
				// 2 meaning that the first token wil lookback past the BOS
				// token resulting
				// in an error.
				AbstractToken firstTok = TbNavigationUtil
						.firstTokenWithoutBOS(curBlock);
				if (firstTok != null) {
					firstTok.setLookback(0);
				}
			}
		}
	}

	private Template getType(TextBlock block) {
		return blockToTemplate.get(block);
	}

	private void addToParentContext(TextBlock startBlock) {

		List<RefObject> modelElements = startBlock
				.getCorrespondingModelElements();

		TextBlock parentBlock = startBlock.getParentBlock();
		while (parentBlock != null) {
			Template t = getType(parentBlock);

			if (t instanceof ContextTemplate) {
				ContextTemplate ct = (ContextTemplate) t;
				if (ct.isContext()) {
					parentBlock.getElementsInContext().addAll(modelElements);
					return;
				}
			}

			parentBlock = parentBlock.getParentBlock();
		}

	}

	void addNextToken(String value, SequenceElement se) {
		if (value != null && !value.equals("")) {
			AbstractToken t = null;
			// TODO this is currentl needed as token types are stored in
			// textblocks model
			lexer.setCharStream(new ANTLRStringStream(value));
			Token lexerToken = lexer.nextToken();

			if (lexerToken.getChannel() == Token.HIDDEN_CHANNEL) {
				if (debug) {
					System.out.println("adding OmittedToken: '" + value + "'");
				}
				t = createOmittedToken();
			} else {
				if (debug) {
					System.out.println("adding LexedToken: '" + value + "'");
				}
				t = createLexedToken(se);
			}
			t.setType(lexerToken.getType());
			// end TODO

			t.setValue(value);
			t.setOffset(curOffset);
			t.setLength(value.length());

			addToken(t);

			TbMarkingUtil.markTokenRelexed(t);

			rootBlockCachedString.append(value);
		}
	}

	void addBosToken() {
		Bostoken bos = ANTLRIncrementalLexerAdapter.createBOSToken(pack,
				VersionEnum.REFERENCE,
				ANTLRIncrementalLexerAdapter.bosTokenType);
		addToken(bos);
	}

	void addEosToken() {
		Eostoken eos = ANTLRIncrementalLexerAdapter.createEOSToken(pack,
				VersionEnum.REFERENCE,
				ANTLRIncrementalLexerAdapter.eosTokenType);
		eos.setOffset(curOffset);
		addToken(eos);
	}

	void addToken(AbstractToken t) {
		curOffset += t.getLength();
		curBlockLength += t.getLength();

		curBlock.getTokens().add(t);
	}

	@Override
	public void close() {
		if (this.oldTextBlock != null) {
			try {
				this.mergeOldAndNewTextBlocks(this.oldTextBlock, null);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// no more backtracking after this point
		// execute all textblock commands
		for (TextBlockCommand command : current) {
			command.execute();
		}

		// finish rootBlock

		// check first if any output was printed
		if (rootBlock != null) {
			if (debug) {
				System.out.println("adding EosToken");
			}
			Template template = this.blockToTemplate.get(rootBlock);
			if (template instanceof ClassTemplate) {
				if (((ClassTemplate) template).isMain()) {
					addEosToken();
				}
			} else if (template == null) {
				if (rootBlock.getParentBlock() == null) {
					addEosToken();
				}
			}

			TbValidationUtil.assertTextBlockConsistencyRecursive(rootBlock);
			rootBlock.setCachedString(rootBlockCachedString.toString());
		}
	}

	private void mergeOldAndNewTextBlocks(TextBlock oldTb,
			AddNextTextBlockCommand newTbCommand) throws Exception {
		assert (oldTb != null);

		int indexOfNewTbCommand = -1;
		Stack<Integer> handle = new Stack<Integer>();
		List<TextBlockCommand> corrNewTbCommands = new ArrayList<TextBlockCommand>();
		List<AddNextTokenCommand> corrNewTokenCommands = new ArrayList<AddNextTokenCommand>();
		List<AbstractToken> tokensOfOldTb = new ArrayList<AbstractToken>();
		List<TextBlock> subBlocksOfOldTb = new ArrayList<TextBlock>();

		// check if corresponding ModelElement still exists
		List<RefObject> oldModelElements = oldTb
				.getCorrespondingModelElements();
		if (oldModelElements.size() == 0) {
			// TODO delete TextBlock
		}

		// compare model elements of old TextBlock and correpsonding
		// TextBlockCommand
		if (newTbCommand == null) {
			for (TextBlockCommand command : this.current) {
				if (command instanceof AddNextTextBlockCommand) {
					if (oldModelElements
							.contains(((AddNextTextBlockCommand) command).object)) {
						newTbCommand = (AddNextTextBlockCommand) command;
						indexOfNewTbCommand = this.current
								.indexOf(newTbCommand);
						handle.push(newTbCommand.handle);
						break;
					}
				}
			}
		}

		if (newTbCommand != null) {
			// create lists containing all Tokens and SubBlocks for old
			// TextBlock
			for (AbstractToken t : oldTb.getTokens()) {
				if (!(t instanceof Bostoken) && !(t instanceof Eostoken)) {
					tokensOfOldTb.add(t);
				}
			}

			subBlocksOfOldTb = oldTb.getSubBlocks();

			// create lists containing all TokenCommands and TextBlockCommands
			// for current TextBlockCommand
			for (TextBlockCommand tbc : this.current.subList(
					indexOfNewTbCommand + 1, this.current.size())) {
				// Token is direct child of new TextBlock
				if (tbc instanceof AddNextTokenCommand
						&& handle.peek().equals(newTbCommand.handle)) {
					corrNewTokenCommands.add((AddNextTokenCommand) tbc);
				}

				// TextBlock is direct child of new TextBlock
				else if (tbc instanceof AddNextTextBlockCommand
						&& handle.peek().equals(newTbCommand.handle)) {
					corrNewTbCommands.add(tbc);
					handle.push(((AddNextTextBlockCommand) tbc).handle);
				}

				// Finish TextBlock
				else if (tbc instanceof FinishTextBlockCommand
						&& !handle.peek().equals(newTbCommand.handle)) {
					handle.pop();
					// if parent TextBlock is the new TextBlock add
					// FinishCommand
					if (handle.peek().equals(newTbCommand.handle)) {
						corrNewTbCommands.add(tbc);
					}
				}

				// Finish new TextBlock and exit loop
				else if (tbc instanceof FinishTextBlockCommand
						&& handle.peek().equals(newTbCommand.handle)) {
					handle.pop();
					break;
				}
			}

			// compare tokens of old TextBlock and TextBlockCommand
			if (this.formatMode) {
				this.mergeTokensWithFormat(indexOfNewTbCommand,
						corrNewTokenCommands, tokensOfOldTb);
			} else {
				this.mergeTokensWithoutFormat(indexOfNewTbCommand,
						corrNewTokenCommands, tokensOfOldTb);
			}

			for (TextBlock tb : subBlocksOfOldTb) {
				this.mergeOldAndNewTextBlocks(tb, null);
			}
		}
	}

	private void mergeTokensWithFormat(int indexOfNewTbCommand,
			List<AddNextTokenCommand> commandList, List<AbstractToken> tokenList) {
		List<OmittedToken> omittedTokens = new ArrayList<OmittedToken>();
		LexedToken lowerBorder = null;
		int level = 0;
		int index = -1;
		int upperId = -1;
		// iterate over tokens that are part of the token list and the old
		// TextBlock
		// and conserve old omitted tokens between two lexed tokens
		for (AbstractToken token : tokenList) {
			if (token instanceof LexedToken) {
				LexedToken lexedToken = (LexedToken) token;
				SequenceElement se1 = lexedToken.getSequenceElement();
				for (AddNextTokenCommand command : commandList) {
					SequenceElement se2 = command.se;
					if (se2.equals(se1)
							&& lexedToken.getValue().equals(command.s)) {
						if (lowerBorder != null) {
							upperId = command.getId();
							List<AddNextTokenCommand> toDelete = new ArrayList<AddNextTokenCommand>();
							for (int i = index + 1, currLevel = level; this.current
									.get(i).getId() < upperId; i++) {
								if (this.current.get(i) instanceof AddNextTextBlockCommand) {
									level++;
								} else if (this.current.get(i) instanceof FinishTextBlockCommand) {
									level--;
								} else if (this.current.get(i) instanceof AddNextTokenCommand
										&& currLevel == level) {
									toDelete
											.add((AddNextTokenCommand) this.current
													.get(i));
								}
							}
							this.current.removeAll(toDelete);

							for (int j = 0, i = index + 1; j < omittedTokens
									.size(); i++, j++) {
								this.current.add(i, new AddNextTokenCommand(
										omittedTokens.get(j).getValue(), null));
							}
							omittedTokens.clear();
						}
						lowerBorder = lexedToken;
						index = this.current.indexOf(command);
						break;
					}
				}
			} else if (token instanceof OmittedToken && lowerBorder != null) {
				omittedTokens.add((OmittedToken) token);
			} else if (token instanceof OmittedToken && lowerBorder == null) {
				if (this.current.get(indexOfNewTbCommand) instanceof AddNextTextBlockCommand) {
					this.current.add(indexOfNewTbCommand + 1,
							new AddNextTokenCommand(token.getValue(), null));
				}
			}
		}
	}

	private void mergeTokensWithoutFormat(int indexOfNewTbCommand,
			List<AddNextTokenCommand> commandList, List<AbstractToken> tokenList) {
		List<OmittedToken> omittedTokens = new ArrayList<OmittedToken>();
		LexedToken lowerBorder = null;
		int index = -1;
		// iterate over tokens that are part of the token list and the old
		// TextBlock
		// and conserve old omitted tokens between two lexed tokens
		for (AbstractToken token : tokenList) {
			if (token instanceof LexedToken) {
				LexedToken lexedToken = (LexedToken) token;
				SequenceElement se1 = lexedToken.getSequenceElement();
				for (AddNextTokenCommand command : commandList) {
					SequenceElement se2 = command.se;
					if (se2.equals(se1)
							&& lexedToken.getValue().equals(command.s)) {
						if (lowerBorder != null) {
							for (int j = 0, i = index; j < omittedTokens.size(); i++, j++) {
								this.printOmittedToken(omittedTokens.get(j), this.current.indexOf(command));
							}
						}
						omittedTokens.clear();
						lowerBorder = lexedToken;
						index = this.current.indexOf(command);
						break;
					}
				}
			}
			else if (token instanceof OmittedToken && lowerBorder != null) {
				omittedTokens.add((OmittedToken) token);
			} 
			else if (token instanceof OmittedToken && lowerBorder == null) {
				if (this.current.get(indexOfNewTbCommand) instanceof AddNextTextBlockCommand) {
					this.printOmittedToken((OmittedToken) token, indexOfNewTbCommand+1);
				}
			}
		}
	}

	private void printOmittedToken(OmittedToken oToken, int index) {
		for (Integer i : this.pFactory.getOmittedTokensForFormatting()) {
			if (i.intValue() == oToken.getType()) {
				return;
			}
		}
		
		this.current.add(index, new AddNextTokenCommand(oToken));

		if (this.prettyPrinter != null) {
			Map<Integer, tcs.Token> tokensById = new HashMap<Integer, tcs.Token>();
			String hct[] = this.pFactory.getHiddenChannelTokenNames();
			int hctIds[] = this.pFactory.getHiddenChannelTokens();
			
			for (int i = 0; i < hctIds.length; i++) {
				if(this.prettyPrinter.getTokens().containsKey(hct[i]) ) {
					tokensById.put(hctIds[i], this.prettyPrinter.getTokens().get(hct[i]));
				}
			}
			tcs.Token corrTcsToken = tokensById.get(oToken.getType());
			if(corrTcsToken != null)
			{
				OrPattern pattern = corrTcsToken.getPattern();
				Collection<SimplePattern> sPatterns = pattern.getSimplePatterns();
				if(sPatterns != null)
				{
					for(SimplePattern sp : sPatterns)
					{
						if(sp instanceof RulePattern)
						{
							Rule rule = ((RulePattern) sp).getRule();
							if(rule != null && (rule instanceof EndOfLineRuleWrapper || rule instanceof MultiLineRuleWrapper))
							{
								this.current.add(index+1, new AddNextTokenCommand("\n", null));
							}
						}
					}
				}
			}
		} else {
			return;
		}
	}

	private SequenceElement getCurrentSE() {
		if (!currentSE.isEmpty()) {
			return currentSE.peek();
		}

		return null;
	}

	@Override
	public int startClassTemplateForObject(RefObject object, Template t) {
		int handle = textBlocksHandleCounter++;
		current.add(new AddNextTextBlockCommand(object, t, getCurrentSE(),
				handle));
		return handle;
	}

	@Override
	public void endClassTemplate(int handle) {
		current.add(new FinishTextBlockCommand(handle));
	}

	@Override
	public void debug(String string) {
		current.add(new AddNextTokenCommand(string, getCurrentSE()));
	}

	@Override
	public void printBoolean(boolean v) {
		current.add(new AddNextTokenCommand("" + v, getCurrentSE()));
	}

	@Override
	public void printComment(String c) {
		current.add(new AddNextTokenCommand(c, getCurrentSE()));
	}

	@Override
	public void printEscapedIdentifier(String identEscStart, String ident,
			String identEscEnd) {
		current.add(new AddNextTokenCommand(
				identEscStart + ident + identEscEnd, getCurrentSE()));
	}

	@Override
	public void printIdentifier(String ident) {
		current.add(new AddNextTokenCommand(ident, getCurrentSE()));
	}

	@Override
	public void printInteger(int v) {
		current.add(new AddNextTokenCommand("" + v, getCurrentSE()));
	}

	@Override
	public void printKeyword(String keyword) {
		current.add(new AddNextTokenCommand(keyword, getCurrentSE()));
	}

	@Override
	public void printReal(String string) {
		current.add(new AddNextTokenCommand(string, getCurrentSE()));
	}

	@Override
	public void printString(String stringDelim, String v) {
		current.add(new AddNextTokenCommand(stringDelim + v + stringDelim,
				getCurrentSE()));
	}

	@Override
	public void printSymbol(String symbol) {
		current.add(new AddNextTokenCommand(symbol, getCurrentSE()));
	}

	@Override
	public void printWhiteSpace(String ws) {
		current.add(new AddNextTokenCommand(ws, getCurrentSE()));
	}

	@Override
	public int createSafePoint() {
		List<TextBlockCommand> store = new ArrayList<TextBlockCommand>(current);
		curBackupHandle++;

		if (debug) {
			System.out.println("creating savepoint " + curBackupHandle
					+ " with " + store.size() + " commands saved");
		}

		backup.put(curBackupHandle, store);
		return curBackupHandle;
	}

	@Override
	public void resetToSafePoint(int handle) {
		current = backup.get(handle);

		if (debug) {
			System.out.println("resetting to savepoint " + handle + " with "
					+ current.size() + " commands restored");
		}

	}

	@Override
	public void enterSequenceElement(SequenceElement e) {
		currentSE.push(e);

	}

	@Override
	public void exitSequenceElement() {
		currentSE.pop();

	}

	public TextBlock getOldTextBlock() {
		return oldTextBlock;
	}

	public void setOldTextBlock(TextBlock oldTextBlock) {
		this.oldTextBlock = oldTextBlock;
	}

	public ClassTemplate getTemplateForOldTextBlock() {
		return templateForOldTextBlock;
	}

	public void setTemplateForOldTextBlock(ClassTemplate templateForOldTextBlock) {
		this.templateForOldTextBlock = templateForOldTextBlock;
	}
}