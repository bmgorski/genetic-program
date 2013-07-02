package com.genetic.program.tree;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.hamcrest.core.IsInstanceOf;

public class BinaryMathTree {
	private TreeNode rootNode;
	private List<String> variableNames = new ArrayList<String>();
	
	public TreeNode getRootNode() {
		return rootNode;
	}

	public void setRootNode(TreeNode rootNode) {
		this.rootNode = rootNode;
	}

	public BigDecimal getValue(HashMap<String, BigDecimal> variables){
		return rootNode.getValue(variables);
	}

	public List<String> getVariableNames() {
		return variableNames;
	}
	
	public int size(){
		return rootNode.getNumberOfChildren();
	}
	
	public List<TreeNode> levelorder(){
		List<TreeNode> levelOrder = new ArrayList<TreeNode>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(rootNode);
		
		while(!queue.isEmpty()){
		    TreeNode treeNode = queue.poll();
		    levelOrder.add(treeNode);
		    if(treeNode instanceof Operator){
	    	    Operator operator = (Operator)treeNode;
	    	    if(operator.getLeftNode() != null){
	    	    	queue.add((TreeNode)operator.getLeftNode());
	    	    }
	    	    if(operator.getLeftNode() != null){
	    	    	queue.add((TreeNode)operator.getLeftNode());
	    	    }
		    }
		}
		
		return levelOrder;
	}
}