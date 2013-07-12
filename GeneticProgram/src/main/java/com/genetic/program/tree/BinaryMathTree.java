package com.genetic.program.tree;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinaryMathTree {
	private static final Logger logger = LoggerFactory.getLogger(BinaryMathTree.class);

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
		return rootNode.getNumberOfChildren() + 1;
	}
	
	public List<TreeNode> levelorder(){
		logger.trace("Starting levelorder");
		
		List<TreeNode> levelOrder = new ArrayList<TreeNode>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(this.rootNode);
		
		logger.trace("adding rootNode roteNode size: " + this.rootNode.getNumberOfChildren());
		
		while(!queue.isEmpty()){
		    TreeNode treeNode = queue.poll();
		    levelOrder.add(treeNode);
		    if(treeNode instanceof Operator){
	    	    Operator operator = (Operator)treeNode;
	    	    logger.trace("adding operator operator size: " + operator.getNumberOfChildren());
	    	    if(operator.getLeftNode() != null){
	    	    	queue.add(operator.getLeftNode());
	    	    }
	    	    if(operator.getRightNode() != null){
	    	    	queue.add(operator.getRightNode());
	    	    }
		    }
		} 
		
		return levelOrder;
	}
}