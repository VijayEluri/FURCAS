package com.sap.mi.textual.parsing.textblocks;

import static com.sap.mi.textual.parsing.textblocks.TbNavigationUtil.getLevel;

import java.util.List;

import textblocks.AbstractToken;
import textblocks.DocumentNode;
import textblocks.TextBlock;

public class TbDebugUtil {

	static public void printDebug(List<DocumentNode> list) {
		for (int i = 0; i < list.size(); i++) {
			DocumentNode node = list.get(i);
			if (node instanceof AbstractToken) {
				AbstractToken t = (AbstractToken) node;
				System.out.println("list entry " + i + " " + " is token: "
						+ t.getValue() + " at level " + getLevel(node));
			} else {
				TextBlock b = (TextBlock) node;
				System.out.println("list entry " + i + " " + " is textblock: "
						+ b.getCachedString() + " at level " + getLevel(node));
			}
		}
	}

}