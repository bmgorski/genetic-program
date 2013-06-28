package com.genetic.program.tree;

public abstract class Operator {
	private TreeNode[] threeNode = new TreeNode[2];
	
	public void setTreeNodes(TreeNode treeNode1, TreeNode treeNode2){
		this.threeNode[0] = treeNode1;
		this.threeNode[1] = treeNode2;
	}
	
	public TreeNode getLeftNode(){
		return this.threeNode[0];
	}
	
	public TreeNode getRightNode(){
		return this.threeNode[1];
	}
}
