package com.genetic.program.tree;

import java.util.HashMap;


public class DivisionNode extends Operator implements TreeNode  {

	@Override
	public int nodeType() {
		return TreeNode.DIVISION_NODE;
	}

	@Override
	public double getValue(HashMap<String, String> variables) {
		return getLeftNode().getValue(variables) / getRightNode().getValue(variables);
	}
}
