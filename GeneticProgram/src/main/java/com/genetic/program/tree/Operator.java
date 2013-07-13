package com.genetic.program.tree;

public abstract class Operator  extends TreeNode {
	private TreeNode[] threeNode = new TreeNode[2];
	
	public void setTreeNodes(TreeNode treeNode1, TreeNode treeNode2){
		this.threeNode[0] = treeNode1;
		treeNode1.setParent(this);
		this.threeNode[1] = treeNode2;
		treeNode2.setParent(this);
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
		
		if(this.getLeftNode() != null){
			numberOfChildren++;
			numberOfChildren = numberOfChildren + this.getLeftNode().getNumberOfChildren();
		}
		
		if (this.getRightNode() != null) {
			numberOfChildren++;
			numberOfChildren = numberOfChildren + this.getRightNode().getNumberOfChildren();
		}

		return numberOfChildren;
	}
	
	
	public abstract String operatorStringEquivalant();
}
