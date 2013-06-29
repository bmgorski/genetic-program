package com.genetic.program.tree;

import java.util.HashMap;

public class VariableNode extends Operand  {
	private String variableName;
	
	@Override
	public int nodeType() {
		return TreeNode.ADDITION_NODE;
	}

	@Override
	public double getValue(HashMap<String, Double> variables) {
		return variables.get(variableName);
	}

	public String getVariableName() {
		return variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}
}