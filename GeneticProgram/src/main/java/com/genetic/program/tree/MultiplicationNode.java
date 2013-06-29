package com.genetic.program.tree;

import java.util.HashMap;


public class MultiplicationNode extends Operator {

	@Override
	public int nodeType() {
		return TreeNode.MULTIPLICATION_NODE;
	}

	@Override
	public double getValue(HashMap<String, Double> variables) {
		return this.getLeftNode().getValue(variables) * this.getRightNode().getValue(variables);
	}
}
