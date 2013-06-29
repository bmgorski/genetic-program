package com.genetic.program.model.generation;

import java.math.BigDecimal;

import com.genetic.program.tree.BinaryMathTree;

public class Gene implements Comparable<Gene> {
	private BinaryMathTree genes;
	private BigDecimal score = BigDecimal.ZERO;
	private boolean removeFromGeneration = false;

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public BinaryMathTree getGenes() {
		return genes;
	}

	public void setGenes(BinaryMathTree genes) {
		this.genes = genes;
	}

	@Override
	public int compareTo(Gene o) {
		return this.getScore().compareTo(o.getScore());
	}

	public boolean isRemoveFromGeneration() {
		return removeFromGeneration;
	}

	public void setRemoveFromGeneration(boolean removeFromGeneration) {
		this.removeFromGeneration = removeFromGeneration;
	}
}
