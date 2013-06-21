package com.genetic.program.model.generation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public class Generation {
	private List<Future<Gene>> genes = new ArrayList<Future<Gene>>();

	public List<Future<Gene>> getGenes() {
		return genes;
	}

	public void setGenes(List<Future<Gene>> genes) {
		this.genes = genes;
	}

}