package com.genetic.program.tree;

import java.math.BigDecimal;
import java.util.HashMap;


public class ConstantNode extends Operand  {

	@Override
	public int nodeType() {
		return TreeNode.ADDITION_NODE;
	}

	@Override
	public BigDecimal getValue(HashMap<String, BigDecimal> variables) {
		return this.getLeafValue();
	}
}