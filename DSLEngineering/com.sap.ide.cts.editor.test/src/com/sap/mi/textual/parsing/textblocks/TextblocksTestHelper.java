package com.sap.mi.textual.parsing.textblocks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import textblocks.AbstractToken;
import textblocks.Bostoken;
import textblocks.DocumentNode;
import textblocks.Eostoken;
import textblocks.LexedToken;
import textblocks.TextBlock;

public class TextblocksTestHelper {

	/**
	 * Asserts, that the offset is the sum of the lenghts of all left siblings.
	 * 
	 * @param node
	 *            the DocumentNode to check
	 */
	public static void assertNodeOffset(DocumentNode node) {
		TextBlock parent;

		if (node instanceof AbstractToken) {
			AbstractToken t = (AbstractToken) node;
			parent = t.getParentBlock();
		} else {
			TextBlock b = (TextBlock) node;
			parent = b.getParentBlock();
		}

		if (parent == null) {
			assertEquals(0, node.getOffset());
			return;
		}

		int sum = 0;
		int index = 0;
		// TODO: Replace both TbNavigationUtil.getSubNodeAt() calls with
		// node.getSubNodes().get(), once OCL has been adapted to sort
		// result list by offset correctly
		DocumentNode curNode = TbNavigationUtil.getSubNodeAt(parent, index);
		while (!curNode.equals(node)) {
			sum += curNode.getLength();
			index++;
			curNode = TbNavigationUtil.getSubNodeAt(parent, index);
		}

		assertEquals(sum, node.getOffset());
	}

	/**
	 * Asserts, that a lexedtoken's length equals it's value string's length,
	 * and that a textblock's length equals the sum of it's subnodes.
	 * 
	 * @param node
	 *            the DocumentNode to check
	 */
	public static void assertNodeLength(DocumentNode node) {
		if (node instanceof LexedToken) {
			LexedToken t = (LexedToken) node;
			assertEquals(t.getLength(), t.getValue().length());
		}

		if (node instanceof TextBlock) {
			TextBlock b = (TextBlock) node;
			int sum = 0;
			for (DocumentNode subNode : b.getSubNodes()) {
				sum += subNode.getLength();
			}

			assertEquals(sum, b.getLength());
		}
	}

	public static void assertTextBlockAndChildren(TextBlock block) {

		assertTextBlockChildrenSortedByOffset(block);

		assertNodeLength(block);
		assertNodeOffset(block);

		for (TextBlock subBlock : block.getSubBlocks()) {
			assertTextBlockAndChildren(subBlock);
		}

		for (AbstractToken tok : block.getTokens()) {
			if (!(tok instanceof Bostoken) && !(tok instanceof Eostoken)) {
				assertNodeLength(tok);
				assertNodeOffset(tok);
			}
		}

	}

	public static void assertTextBlockChildrenSortedByOffset(TextBlock block) {
		int curOffset = -1;
		int curAbsOffset = -1;
		for (TextBlock subBlock : block.getSubBlocks()) {
			assertTrue(curOffset < subBlock.getOffset());
			int absOffset = TbUtil.getAbsoluteOffset(subBlock);
			assertTrue(curAbsOffset < absOffset);
			curOffset = subBlock.getOffset();
			curAbsOffset = absOffset;

		}

		curOffset = -1;
		curAbsOffset = -1;
		for (AbstractToken tok : block.getTokens()) {
			if (!(tok instanceof Bostoken) && !(tok instanceof Eostoken)) {
				assertTrue(curOffset < tok.getOffset());
				int absOffset = TbUtil.getAbsoluteOffset(tok);
				assertTrue(curAbsOffset < absOffset);
				curOffset = tok.getOffset();
				curAbsOffset = absOffset;
			}
		}
	}

	/**
	 * Assert, that the cached string of a block equals the concatenated string
	 * of it's children.
	 * 
	 * @param block
	 *            TextBlock to check
	 */
	public static void assertCachedString(TextBlock block) {
		String complete = "";
		// TODO: replace TbNavigationUtil.getSubNodes(),
		// once OCL of DocumentNode.getSubNodes() sorts correctly
		for (DocumentNode subNode : TbNavigationUtil.getSubNodes(block)) {
			if (subNode instanceof AbstractToken) {
				AbstractToken t = (AbstractToken) subNode;
				// catch null value of eos and bos token
				if (t.getValue() != null) {
					complete += t.getValue();
				}
			} else {
				TextBlock b = (TextBlock) subNode;
				complete += b.getCachedString();
			}
		}

		assertEquals(complete, block.getCachedString());
	}

}