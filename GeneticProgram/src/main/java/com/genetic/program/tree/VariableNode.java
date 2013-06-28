package com.genetic.program.tree;

import java.util.HashMap;

import com.genetic.program.math.MathUtil;


public class VariableNode extends Operand implements TreeNode  {
	private String variableName;
	
	@Override
	public int nodeType() {
		return TreeNode.ADDITION_NODE;
	}

	@Override
	public double getValue(HashMap<String, String> variables) {
		return MathUtil.stringToDouble(variables.get(variableName));
	}

	public String getVariableName() {
		return variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}
}