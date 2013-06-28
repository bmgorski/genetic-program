package com.genetic.program.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BinaryMathTree {
	private TreeNode rootNode;
	private List<String> variableNames = new ArrayList<String>();
	
	public TreeNode getRootNode() {
		return rootNode;
	}

	public void setRootNode(TreeNode rootNode) {
		this.rootNode = rootNode;
	}

	public double getValue(HashMap<String, String> variables){
		return rootNode.getValue(variables);
	}

	public List<String> getVariableNames() {
		return variableNames;
	}
}