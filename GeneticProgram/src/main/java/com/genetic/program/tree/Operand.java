package com.genetic.program.tree;

public abstract class Operand extends TreeNode {
	private double leafValue;

	public double getLeafValue() {
		return leafValue;
	}

	public void setLeafValue(double leafValue) {
		this.leafValue = leafValue;
	}
	
	@Override
	public int getNumberOfChildren() {
		return 0;
	}
}