package com.sap.ide.cts.editor.document;

import java.util.Collection;
import java.util.HashSet;

import org.antlr.runtime.Lexer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.sap.furcas.metamodel.TCS.ClassTemplate;
import com.sap.furcas.metamodel.TCS.ConcreteSyntax;
import com.sap.furcas.metamodel.textblocks.Bostoken;
import com.sap.furcas.metamodel.textblocks.DocumentNode;
import com.sap.furcas.metamodel.textblocks.Eostoken;
import com.sap.furcas.metamodel.textblocks.LexedToken;
import com.sap.furcas.metamodel.textblocks.TextBlock;
import com.sap.furcas.metamodel.textblocks.TextblocksFactory;
import com.sap.furcas.metamodel.textblocks.TextblocksPackage;
import com.sap.furcas.metamodel.textblocks.Version;
import com.sap.furcas.runtime.parser.impl.ObservableInjectingParser;
import com.sap.furcas.runtime.textblocks.TbNavigationUtil;
import com.sap.furcas.runtime.textblocks.TbUtil;
import com.sap.furcas.runtime.textblocks.validation.TbValidationUtil;
import com.sap.ide.cts.editor.CtsActivator;
import com.sap.ide.cts.editor.commands.PrettyPrintCommand;
import com.sap.ide.cts.editor.prettyprint.textblocks.TextBlockTCSExtractorStream;
import com.sap.ide.cts.parser.incremental.ParserFactory;
import com.sap.ide.cts.parser.incremental.TextBlockMappingBrokenException;
import com.sap.ide.cts.parser.incremental.antlr.ANTLRIncrementalLexerAdapter;


/**
 * Util classes required to get a corresponding rootBlock for an
 * existing rootObject.
 * 
 * @author D049157
 * 
 */
public class TbModelInitializationUtil {

    /**
     * Determines an existing root TextBlock
     * 
     * @param rootObject
     * @param tbPackage
     * @param rootTemplate
     * @return a TextBlock or null if none could be found
     * @throws TextBlockMappingBrokenException
     */
    public static TextBlock getRootBlockForRootObject(EObject rootObject, TextblocksPackage tbPackage, ClassTemplate rootTemplate)
	    throws TextBlockMappingBrokenException {
	Collection<DocumentNode> nodes = tbPackage.getDocumentNodeReferencesCorrespondingModelElement().getDocumentNode(
		rootObject);

	// find all potential, existing roots. 
	Collection<TextBlock> rootBlocks = new HashSet<TextBlock>();
	Collection<TextBlock> rootBlocksWithBrokenMapping = new HashSet<TextBlock>(); 
	for (DocumentNode documentNode : nodes) {
	    if (documentNode.getVersion() == null) {
		CtsActivator.logWarning("Document contains unversioned TextBlock: " + documentNode
			+ ". Please consider to cleanup the TextBlocks of this project.");
		continue;
	    }
	    if (!(documentNode instanceof TextBlock)) {
		continue;
	    }
	    TextBlock block = (TextBlock) documentNode;
	    if (!TbNavigationUtil.isUltraRoot(block)) {
		continue;
	    }
	    block = (TextBlock) TbUtil.getNewestVersion(block);
	    // type can only be checked if mapping is not broken
	    if (TbUtil.isTextBlockOfType(rootTemplate, block)) {
		rootBlocks.add(block);
	    } else if (block.getType() == null) {
		rootBlocksWithBrokenMapping.add(block);
	    }
	}
	
	// try to find suitable block
	if (rootBlocks.size() + rootBlocksWithBrokenMapping.size() == 0) {
	    // no root block does exist
	    return null;
	} else if (rootBlocks.size() == 1) {
	    TextBlock existingRoot = rootBlocks.iterator().next();
	    TbValidationUtil.assertTextBlockConsistency(existingRoot);
	    return existingRoot;
	} else if (rootBlocksWithBrokenMapping.size() == 1) {
	    TextBlock existingRoot = rootBlocksWithBrokenMapping.iterator().next();
	    // Might still be valid. Requires further processing
	    throw new TextBlockMappingBrokenException(existingRoot);
	} else {
		if(rootBlocks.size() > 0) {
			//TODO provide selection dialog with possibility to open and/or delete blocks.
			CtsActivator.logWarning("Found more than one root TextBlock for " + rootObject + " using template " + rootTemplate
			    + ": " + rootBlocks);
			return rootBlocks.iterator().next();
		} else if(rootBlocksWithBrokenMapping.size() > 0) {
			//TODO provide selection dialog with possibility to open and/or delete blocks.
			CtsActivator.logWarning("Found more than one root TextBlock for " + rootObject + " using template " + rootTemplate
			    + ": " + rootBlocksWithBrokenMapping);
			return rootBlocksWithBrokenMapping.iterator().next();
		} else {
			//this should not happen.
			return null;
		}
//	    throw new RuntimeException("Found more than one root TextBlock for " + rootObject + " using template " + rootTemplate
//		    + ": " + rootBlocks);
	}
    }

    /**
     * Tries to pretty print a TextBlock model for a given rootObject and syntax
     * 
     * @param rootObject
     * @param tbPackage
     * @param syntax
     * @param connection
     * @param parserFactory
     * @return the created root TextBlock or null if initialization failed
     */
    public static TextBlock initilizeTextBlocksFromModel(EObject rootObject, TextblocksPackage tbPackage,
	    ConcreteSyntax syntax, ResourceSet connection,
	    ParserFactory<? extends ObservableInjectingParser, ? extends Lexer> parserFactory) {

	TextBlock rootBlock = null;
	Resource partitionForTextBlocks = getPartitionForTextBlocks(rootObject);

	TextBlockTCSExtractorStream target = new TextBlockTCSExtractorStream(tbPackage, partitionForTextBlocks,
		parserFactory);
	PrettyPrintCommand ppCommand = new PrettyPrintCommand(rootObject, syntax, target, connection);
	try {
	    connection.getCommandStack().execute(ppCommand);
	} catch (ExecutionRollbackFailedException e) {
	    CtsActivator.logError(e);
	} catch (Exception e) {
	    CtsActivator.logError(e);
	}
	rootBlock = ppCommand.getResult();

	if (rootBlock != null) {
	    partitionForTextBlocks.assignElement(rootBlock);
	    TbValidationUtil.assertTextBlockConsistency(rootBlock);
	}

	return rootBlock;
    }

    /**
     * This method is the last last resort: Create a completely new TextBlock
     * model for a given rootObject.
     * 
     * <p>
     * It should only be used if the actual ConcreteSyntax is unknown and pretty
     * printing therefore becomes impossible.
     * </p>
     * 
     * @param rootObject
     * @return
     */
    public static TextBlock createNewTextBlockForModel(EObject rootObject) {
	Resource partitionForTextBlocks = getPartitionForTextBlocks(rootObject);
	TextBlock rootBlock = createNewTextBlockModel(rootObject, partitionForTextBlocks);
	return rootBlock;
    }

    /**
     * TODO this has to be adapted if there is going to be an extra partition
     * for model elements
     */
    private static Resource getPartitionForTextBlocks(EObject modelElement) {
	return (modelElement).eResource();
    }

    /**
     * Create TextBlock model for a given rootObject;
     * 
     * @param rootObject
     * @param partitionForTextBlocks
     * @return
     */
    private static TextBlock createNewTextBlockModel(EObject rootObject, Resource partitionForTextBlocks) {
	TextblocksFactory tbFactory = TextblocksFactory.eINSTANCE;
	TextBlock rootBlock = tbFactory.createTextBlock();
	partitionForTextBlocks.getContents().add(rootBlock);
	rootBlock.getCorrespondingModelElements().add(rootObject);
	Bostoken bosToken = ANTLRIncrementalLexerAdapter.createBOSToken(tbFactory, Version.REFERENCE,
		ANTLRIncrementalLexerAdapter.bosTokenType);
	rootBlock.getTokens().add(bosToken);

	LexedToken contentToken = tbFactory.createLexedToken();
	contentToken.setValue("");
	contentToken.setLength(0);
	contentToken.setEndColumn(0);
	contentToken.setType(0); // TODO What is the type of nothing?
	contentToken.setVersion(Version.REFERENCE);
	rootBlock.getTokens().add(contentToken);

	Eostoken eosToken = ANTLRIncrementalLexerAdapter.createEOSToken(tbFactory, Version.REFERENCE,
		ANTLRIncrementalLexerAdapter.eosTokenType);
	rootBlock.getTokens().add(eosToken);

	rootBlock.setLength(0);
	rootBlock.setIsComplete(true);
	rootBlock.setEndColumn(0);
	rootBlock.setCachedString("");
	rootBlock.setVersion(Version.REFERENCE);

	return rootBlock;
    }
}