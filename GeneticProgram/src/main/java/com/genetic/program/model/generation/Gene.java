package com.genetic.program.model.generation;

import java.math.BigDecimal;

import com.genetic.program.math.MathUtil;
import com.genetic.program.tree.BinaryMathTree;

public class Gene implements Comparable<Gene> {
	private BinaryMathTree binaryMathTree;
	private BigDecimal fitnessValue = MathUtil.stringToBigDecimalWithScale("0");
	private boolean removeFromGeneration = false;

	public BigDecimal getFitnessValue() {
		return fitnessValue;
	}

	public void setFitnessValue(BigDecimal score) {
		this.fitnessValue = score;
	}

	@Override
	public int compareTo(Gene o) {
		return this.getFitnessValue().compareTo(o.getFitnessValue());
	}

	public boolean isRemoveFromGeneration() {
		return removeFromGeneration;
	}

	public void setRemoveFromGeneration(boolean removeFromGeneration) {
		this.removeFromGeneration = removeFromGeneration;
	}

	public BinaryMathTree getBinaryMathTree() {
		return binaryMathTree;
	}

	public void setBinaryMathTree(BinaryMathTree binaryMathTree) {
		this.binaryMathTree = binaryMathTree;
	}
}
