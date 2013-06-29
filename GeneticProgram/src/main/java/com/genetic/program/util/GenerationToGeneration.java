package com.genetic.program.util;

import java.util.ArrayList;
import java.util.List;

import com.genetic.program.math.MathUtil;
import com.genetic.program.model.generation.Gene;
import com.genetic.program.model.generation.Generation;
import com.rits.cloning.Cloner;

public class GenerationToGeneration {
	private static final int NUMBER_OF_MUTATIONS = 2;
	private static final int NUMBER_OF_CROSSOVERS = 2;
	private static final int MAX_NUMBER_OF_MUTATIONS = 2;
	
	private Cloner _cloner;
	
	public GenerationToGeneration(Cloner cloner){
		this._cloner = cloner;
	}
	
	public Generation populate(Generation oldGeneration) {
		Generation newGeneration = new Generation();
		
		int oldGerationSize = oldGeneration.getGenes().size();
		int currentPlace = 0;
		for(Gene gene : oldGeneration.getGenes()){
			for(int i = 0; i < NUMBER_OF_MUTATIONS; i++){
				newGeneration.getGenes().add(mutateGene(_cloner.deepClone(gene)));
			}
			
			for(int i = 0; i < NUMBER_OF_CROSSOVERS; i++){
				int crossOverWith = currentPlace;
				
				while(crossOverWith == currentPlace){
					crossOverWith = MathUtil.randomNumber(0, oldGerationSize - 1);
				}
				
				newGeneration.getGenes().addAll(crossOverGenes(_cloner.deepClone(gene), _cloner.deepClone(oldGeneration.getGenes().get(crossOverWith))));
			}
			
			currentPlace++;
		}
		
		
		return newGeneration;
	}

	/**
	 * 
	 * @param gene1
	 * @param gene2
	 * @returns gene1 and gene2 after a crossover
	 * 
	 */
	private List<Gene> crossOverGenes(Gene gene1, Gene gene2) {
		List<Gene> genes = new ArrayList<Gene>();
		
		
		
		return genes;
	}

	private Gene mutateGene(Gene gene) {
		int mutateAmount = MathUtil.randomNumber(1, MAX_NUMBER_OF_MUTATIONS);
		
		for(int i = 0; i < mutateAmount; i++){
			
		}
		
		return gene;
	}
	
	
}
