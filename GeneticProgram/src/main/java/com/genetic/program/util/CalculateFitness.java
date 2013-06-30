package com.genetic.program.util;

import java.io.ObjectInputStream.GetField;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;

import com.genetic.program.math.MathUtil;
import com.genetic.program.model.generation.Gene;
import com.genetic.program.model.generation.Generation;

public class CalculateFitness {
	private static final Logger logger = LoggerFactory
			.getLogger(MathUtil.class);
	
	public static void caluclateFitnessValuesAndPrune(Generation generation, List<BigDecimal> environmentVariables, List<BigDecimal> enviromentFitnessTargets, BigDecimal maxVariance){
		
		List<Future<Gene>> futures = new ArrayList<Future<Gene>>();
		for(Gene gene: generation.getGenes()){
			futures.add(actuallyCaluclateFitnessValueAndPrune(gene, environmentVariables, enviromentFitnessTargets, maxVariance));
		}
		
		Iterator<Future<Gene>> iterator = futures.iterator();
		
		Set<Gene> unqueueGenes = new TreeSet<Gene>();
		
		while(iterator.hasNext()){
			try {
				Future<Gene> future = iterator.next();
			
				Gene gene = future.get();
			
				if(gene.isRemoveFromGeneration()){
					iterator.remove();
				}
				else{
					unqueueGenes.add(gene);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		List<Gene> genes = new ArrayList<Gene>();
		genes.addAll(unqueueGenes);
		
		generation.setGenes(genes);
		
		
		
		
		
		
		logger.trace("Number of genes remaining: " + generation.getGenes().size());
		
		if(logger.isTraceEnabled()){
			for(Gene gene: generation.getGenes()){
				logger.trace(gene.getFitnessValue().toString());
			}
		}
	}
	
	@Async
	private static Future<Gene> actuallyCaluclateFitnessValueAndPrune(final Gene gene, List<BigDecimal> environmentVariables, List<BigDecimal> enviromentFitnessTargets, BigDecimal maxFitnessValue) {
		BigDecimal fintnessValue = BigDecimal.ZERO;
		try{
			
			//TODO calculate one at a time so we can stop once we reach the maxFitnessValue
			List<BigDecimal> results = MathUtil.generateBinaryMathTreeFitness(environmentVariables, gene.getBinaryMathTree());
			
			
			int count = 0;
			for(BigDecimal result : results){
				logger.trace("result: " + result);
				logger.trace("enviromentFitnessTarget: " + (result.subtract(enviromentFitnessTargets.get(count))).abs());
				BigDecimal addValue = result.subtract(enviromentFitnessTargets.get(count));
				addValue = addValue.abs();
				logger.trace("addValue: " + addValue.toString());
				
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
		
		return new AsyncResult<Gene>(gene);
	}
}