package com.genetic.program.tree;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.genetic.program.controller.HomeController;


public class AdditionNode extends Operator {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Override
	public int nodeType() {
		return TreeNode.ADDITION_NODE;
	}

	@Override
	//sometimes the right node can be null if that is the case just return the value of the left node
	public double getValue(HashMap<String, Double> variables) {
		logger.trace("Doing Addition");
		logger.trace("Left Node: " + this.getLeftNode().nodeType());
		logger.trace("Right Node: " + this.getRightNode().nodeType());
		
		if(getLeftNode() == null){
			return this.getRightNode().getValue(variables);
		}
		return this.getLeftNode().getValue(variables) + this.getRightNode().getValue(variables);
	}
}
