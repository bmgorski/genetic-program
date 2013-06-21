package com.genetic.program.model.generation;

import java.math.BigDecimal;
import uk.co.cogitolearning.cogpar.ExpressionNode;

public class Gene {
	private ExpressionNode expressionNode;
	private BigDecimal score;

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public ExpressionNode getExpressionNode() {
		return expressionNode;
	}

	public void setExpressionNode(ExpressionNode expressionNode) {
		this.expressionNode = expressionNode;
	}
}
