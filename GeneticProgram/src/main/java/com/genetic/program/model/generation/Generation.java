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
	
	public int getGenerationMaxSize(){
		int maxLength = 0;
		for(Gene gene : genes){
			int size = gene.getBinaryMathTree().size();
			if(maxLength < size){
				maxLength = size;
			}
		}
		return maxLength;
	}

}