package com.genetic.program.tree;

import java.math.BigDecimal;

public abstract class Operand extends TreeNode {
	private BigDecimal leafValue;
	
	@Override
	public int getNumberOfChildren() {
		return 0;
	}

	public BigDecimal getLeafValue() {
		return leafValue;
	}

	public void setLeafValue(BigDecimal leafValue) {
		this.leafValue = leafValue;
	}
	
	
}