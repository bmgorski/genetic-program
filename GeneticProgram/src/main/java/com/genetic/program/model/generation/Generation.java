package com.genetic.program.model.generation;

import java.util.ArrayList;
import java.util.List;

public class Generation {
	private List<Gene> genes = new ArrayList<Gene>();

	public List<Gene> getGenes() {
		return genes;
	}

	public void setGenes(List<Gene> genes) {
		this.genes = genes;
	}

}