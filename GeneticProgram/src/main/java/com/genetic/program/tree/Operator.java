package com.genetic.program.tree;

public abstract class Operator  implements TreeNode {
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
	
	@Override
	public int getNumberOfChildren() {
		int numberOfChildren = 0;
		
		if(getLeftNode() != null){
			numberOfChildren++;
		}
		
		if (getRightNode() != null) {
			numberOfChildren++;
		}

		return numberOfChildren + getLeftNode().getNumberOfChildren() + getRightNode().getNumberOfChildren();
	}
	
	public abstract String operatorStringEquivalant();
}
