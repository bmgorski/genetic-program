package com.genetic.program.tree;

import java.math.BigDecimal;
import java.util.HashMap;


public class MultiplicationNode extends Operator {

	@Override
	public int nodeType() {
		return TreeNode.MULTIPLICATION_NODE;
	}

	@Override
	public BigDecimal getValue(HashMap<String, BigDecimal> variables) {
		return this.getLeftNode().getValue(variables).multiply(this.getRightNode().getValue(variables));
	}
	
	@Override
	public String operatorStringEquivalant() {
		return "*";
	}
}
