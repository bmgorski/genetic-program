package com.genetic.program.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genetic.program.math.MathUtil;
import com.genetic.program.model.generation.Gene;
import com.genetic.program.model.generation.Generation;

public class CalculateFitness {
	
	private static final int MAX_NUMBER_AFTER_PRUNNING = 2000;
	private static final Logger logger = LoggerFactory
			.getLogger(MathUtil.class);
	
	public static void caluclateFitnessValuesAndPrune(Generation generation, List<BigDecimal> environmentVariables, List<BigDecimal> enviromentFitnessTargets, BigDecimal maxVariance){
		
		Set<Gene> unqueueGenes = new TreeSet<Gene>();
		
		for(Gene gene: generation.getGenes()){		
			gene = actuallyCaluclateFitnessValueAndPrune(gene, environmentVariables, enviromentFitnessTargets, maxVariance);
		
			if(gene.isRemoveFromGeneration()){
				
			}
			else{
				unqueueGenes.add(gene);
			}
		}
		
		List<Gene> genes = new ArrayList<Gene>();
		genes.addAll(unqueueGenes);
		
		
		if(genes.size() > MAX_NUMBER_AFTER_PRUNNING){
			Iterator<Gene> i = genes.iterator();
			int count = 1;
			while(i.hasNext()){
				i.next();
				
				if(count > MAX_NUMBER_AFTER_PRUNNING){
					i.remove();
				}
				
				count++;
			}
		}
		
		generation.setGenes(genes);
		
		
		
		
		
		
		logger.trace("Number of genes remaining: " + generation.getGenes().size());
		
		if(logger.isTraceEnabled()){
			for(Gene gene: generation.getGenes()){
				logger.trace(gene.getFitnessValue().toString());
			}
		}
	}
	
	private static Gene actuallyCaluclateFitnessValueAndPrune(final Gene gene, List<BigDecimal> environmentVariables, List<BigDecimal> enviromentFitnessTargets, BigDecimal maxFitnessValue) {
		BigDecimal fintnessValue = MathUtil.stringToBigDecimalWithScale("0");
		try{
			
			//TODO calculate one at a time so we can stop once we reach the maxFitnessValue
			List<BigDecimal> results = MathUtil.generateBinaryMathTreeFitness(environmentVariables, gene.getBinaryMathTree());
			
			
			int count = 0;
			for(BigDecimal result : results){				
				BigDecimal addValue = result.subtract(enviromentFitnessTargets.get(count));
				
				addValue = addValue.abs();
				

				
				fintnessValue = fintnessValue.add(addValue);
				logger.trace("Score: " + fintnessValue.toString());
				count++;
				
				if(fintnessValue.compareTo(maxFitnessValue) == 1){
					gene.setRemoveFromGeneration(true);
					break;
				}
			}
			
			gene.setFitnessValue(fintnessValue);
		}
		catch(Exception e){
			gene.setRemoveFromGeneration(true);
		}
		
		return gene;
	}
}