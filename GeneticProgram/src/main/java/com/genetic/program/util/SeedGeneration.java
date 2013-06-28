package com.genetic.program.util;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import com.genetic.program.model.generation.Gene;
import com.genetic.program.model.generation.Generation;

public class SeedGeneration {
	
	public Generation getSeeds() {
		Generation generation = new Generation();
		
		return generation;
	}

	@SuppressWarnings("unused")
	private Future<Gene> generateGene() {
		return GeneticConstants.pool.submit(new Callable<Gene>() {
			@Override
			public Gene call() throws Exception {
				Gene gene = new Gene();

				//gene.setExpressionNode(getRandomNode(settings));
				// TODO compare seed to target
				return gene;
			}
		});
	}
}
