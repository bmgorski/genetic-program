package com.genetic.program.model.generation;

import java.math.BigDecimal;

import com.genetic.program.tree.BinaryMathTree;

public class Gene {
	private BinaryMathTree genes;
	private BigDecimal score;

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
}
