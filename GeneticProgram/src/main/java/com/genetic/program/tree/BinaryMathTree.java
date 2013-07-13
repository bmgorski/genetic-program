package com.genetic.program.tree;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinaryMathTree {
	private static final Logger logger = LoggerFactory
			.getLogger(BinaryMathTree.class);
	private TreeNode rootNode;
	private List<String> variableNames = new ArrayList<String>();

	public BinaryMathTree(TreeNode rootNode) {
		this.rootNode = rootNode;
	}

	public BinaryMathTree() {
	}

	public TreeNode getRootNode() {
		return rootNode;
	}

	public void setRootNode(TreeNode rootNode) {
		this.rootNode = rootNode;
	}

	public BigDecimal getValue(HashMap<String, BigDecimal> variables) {
		return rootNode.getValue(variables);
	}

	public List<String> getVariableNames() {
		return variableNames;
	}

	public int size() {
		return rootNode.getNumberOfChildren() + 1;
	}

	public List<TreeNode> levelorder() {
		logger.trace("Starting levelorder");

		List<TreeNode> levelOrder = new ArrayList<TreeNode>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(this.rootNode);

		while (!queue.isEmpty()) {
			TreeNode treeNode = queue.poll();
			levelOrder.add(treeNode);
			if (treeNode instanceof Operator) {
				Operator operator = (Operator) treeNode;
				logger.trace("adding operator operator size: "
						+ operator.getNumberOfChildren());
				if (operator.getLeftNode() != null) {
					queue.add(operator.getLeftNode());
				}
				if (operator.getRightNode() != null) {
					queue.add(operator.getRightNode());
				}
			}
		}

		return levelOrder;
	}

	public List<TreeNode> postOrder() {
		Stack<TreeNode> nodeStack = new Stack<TreeNode>();
		List<TreeNode> postOrder = new ArrayList<TreeNode>();
		nodeStack.push(this.rootNode);
		TreeNode prevNode = null;

		while (!nodeStack.isEmpty()) {
			TreeNode currNode = nodeStack.peek();
			if (prevNode == null || (prevNode.left() != null && prevNode.left().equals(currNode))
					|| (prevNode.right() != null && prevNode.right().equals(currNode))) {
				if (currNode.left() != null) {
					nodeStack.push(currNode.left());
				} else if (currNode.right() != null) {
					nodeStack.push(currNode.right());
				}
			} else if ((currNode.left() == null && prevNode == null) || (currNode.left() != null && currNode.left().equals(prevNode))) {
				if (currNode.right() != null) {
					nodeStack.push(currNode.right());
				}
			} else {
				postOrder.add(currNode);
				nodeStack.pop();
			}
			prevNode = currNode;
		}
		
		return postOrder;
	}
	
	public String infix(){
		List<TreeNode> nodes = postOrder();
		Stack<Object> objects = new Stack<Object>();
		
		for(TreeNode node : nodes){
			if(node instanceof Operand){
				objects.push(node);
			}
			else{
				Object node1 = objects.pop();
				Object node2 = objects.pop();
				
				String currentValue = "( " + stringOrTreeNodeToString(node2) + stringOrTreeNodeToString(node) + stringOrTreeNodeToString(node1) + " )";
				objects.push(currentValue);
			}
		}
		
		return (String) objects.pop();
	}
	
	private String stringOrTreeNodeToString(Object object){
		if(object instanceof String){
			return (String) object;
		}
		else if(object instanceof Operator){
			Operator operator = (Operator) object;
			return " " + operator.operatorStringEquivalant() + " ";
		}
		else if(object instanceof VariableNode){
			VariableNode variableNode = (VariableNode) object;
			return variableNode.getVariableName();
		}
		else{
			ConstantNode constantNode = (ConstantNode) object;
			return constantNode.getLeafValue().toString();
		}
	}
}