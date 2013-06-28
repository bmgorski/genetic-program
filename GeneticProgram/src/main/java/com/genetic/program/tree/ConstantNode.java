package com.genetic.program.tree;

import java.util.HashMap;


public class ConstantNode extends Operand implements TreeNode  {

	@Override
	public int nodeType() {
		return TreeNode.ADDITION_NODE;
	}

	@Override
	public double getValue(HashMap<String, Double> variables) {
		return this.getLeafValue();
	}
}