package com.genetic.program.tree;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.genetic.program.math.MathUtil;


public class DivisionNode extends Operator {
	private static final Logger logger = LoggerFactory
			.getLogger(MathUtil.class);
	
	@Override
	public int nodeType() {
		return TreeNode.DIVISION_NODE;
	}

	@Override
	public double getValue(HashMap<String, Double> variables) {
		logger.trace("Doing Division");
		logger.trace("Left Node: " + this.getLeftNode().nodeType());
		logger.trace("Right Node: " + this.getRightNode().nodeType());
		
		return this.getLeftNode().getValue(variables) / this.getRightNode().getValue(variables);
	}
	
	@Override
	public String operatorStringEquivalant() {
		return "/";
	}
}
