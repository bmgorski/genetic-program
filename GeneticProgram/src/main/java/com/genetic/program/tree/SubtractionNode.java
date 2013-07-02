package com.genetic.program.tree;

import java.math.BigDecimal;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.genetic.program.controller.HomeController;

public class SubtractionNode extends Operator  {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Override
	public int nodeType() {
		return TreeNode.SUBTRACTION_NODE;
	}

	@Override
	//sometimes the right node can be null if that is the case just return the negative value of the left node
	public BigDecimal getValue(HashMap<String, BigDecimal> variables) {
		if(getLeftNode() == null){
			return this.getRightNode().getValue(variables).negate();
		}
		
		logger.trace("Doing Subtraction");
		logger.trace("Left Node: " + this.getLeftNode().nodeType());
		logger.trace("Right Node: " + this.getRightNode().nodeType());
		
		return this.getLeftNode().getValue(variables).subtract(this.getRightNode().getValue(variables));
	}
	
	@Override
	public String operatorStringEquivalant() {
		return "-";
	}
}
