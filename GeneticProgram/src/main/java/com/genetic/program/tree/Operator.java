package com.genetic.program.tree;

public abstract class Operator {
	private static final TreeNode[] TREE_NODES = new TreeNode[2];
	
	public void setTreeNodes(TreeNode treeNode1, TreeNode treeNode2){
		TREE_NODES[0] = treeNode1;
		TREE_NODES[1] = treeNode2;
	}
	
	public TreeNode getLeftNode(){
		return TREE_NODES[0];
	}
	
	public TreeNode getRightNode(){
		return TREE_NODES[1];
	}
}
