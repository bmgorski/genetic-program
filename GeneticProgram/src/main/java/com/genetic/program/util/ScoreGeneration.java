package com.genetic.program.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;

import com.genetic.program.math.MathUtil;
import com.genetic.program.model.generation.Gene;
import com.genetic.program.model.generation.Generation;

public class ScoreGeneration {
	private static final Logger logger = LoggerFactory
			.getLogger(MathUtil.class);
	
	public static void caluclateScoresAndPrune(Generation generation, List<BigDecimal> environmentVariables, List<BigDecimal> enviromentFitnessTargets, BigDecimal maxVariance){
		
		List<Future<Gene>> futures = new ArrayList<Future<Gene>>();
		for(Gene gene: generation.getGenes()){
			futures.add(actuallyCaluclateScoresAndPrune(gene, environmentVariables, enviromentFitnessTargets, maxVariance));
		}
		
		Iterator<Future<Gene>> iterator = futures.iterator();
		generation.setGenes(new ArrayList<Gene>());
		
		while(iterator.hasNext()){
			try {
				Future<Gene> future = iterator.next();
			
				Gene gene = future.get();
			
				if(gene.isRemoveFromGeneration()){
					iterator.remove();
				}
				else{
					generation.getGenes().add(gene);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Collections.sort(generation.getGenes());
		
		logger.trace("Number of genes remaining: " + generation.getGenes().size());
		
		if(logger.isTraceEnabled()){
			for(Gene gene: generation.getGenes()){
				logger.trace(gene.getScore().toString());
			}
		}
	}
	
	@Async
	private static Future<Gene> actuallyCaluclateScoresAndPrune(final Gene gene, List<BigDecimal> environmentVariables, List<BigDecimal> enviromentFitnessTargets, BigDecimal maxVariance) {
		BigDecimal score = BigDecimal.ZERO;
		try{
			List<BigDecimal> results = MathUtil.generateBinaryMathTreeScores(environmentVariables, gene.getGenes());
			
			
			int count = 0;
			for(BigDecimal result : results){
				logger.trace("result: " + result);
				logger.trace("enviromentFitnessTarget: " + (result.subtract(enviromentFitnessTargets.get(count))).abs());
				BigDecimal addValue = result.subtract(enviromentFitnessTargets.get(count));
				addValue = addValue.abs();
				logger.trace("addValue: " + addValue.toString());
				
				score = score.add(addValue);
				logger.trace("Score: " + score.toString());
				count++;
				
				if(score.compareTo(maxVariance) == 1){
					gene.setRemoveFromGeneration(true);
					break;
				}
			}
			
			gene.setScore(score);
		}
		catch(Exception e){
			gene.setRemoveFromGeneration(true);
		}
		
		
			
		return new AsyncResult<Gene>(gene);
	}
}