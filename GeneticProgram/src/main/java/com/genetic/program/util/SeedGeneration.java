package com.genetic.program.util;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import com.genetic.program.model.generation.Gene;
import com.genetic.program.model.generation.Generation;
import com.genetic.program.model.generation.Settings;

public class SeedGeneration {
	private Settings _settings;
	
	public SeedGeneration(Settings settings) {
		this._settings = settings;
	}
	
	public Generation getSeeds() {
		Generation generation = new Generation();



		return generation;
	}

	private Future<Gene> generateGene(final Settings settings) {
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
