package com.genetic.program.tree;

import java.math.BigDecimal;
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
	public BigDecimal getValue(HashMap<String, BigDecimal> variables) {
		logger.trace("Doing Division");
		logger.trace("Left Node: " + this.getLeftNode().nodeType());
		logger.trace("Right Node: " + this.getRightNode().nodeType());
		
		return this.getLeftNode().getValue(variables).divide(this.getRightNode().getValue(variables), MathUtil.APPLICATION_ROUNDING);
	}
	
	@Override
	public String operatorStringEquivalant() {
		return "/";
	}
}
