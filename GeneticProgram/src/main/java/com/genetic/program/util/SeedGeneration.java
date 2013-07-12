package com.genetic.program.util;

import java.util.Map;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.genetic.program.math.MathUtil;
import com.genetic.program.model.generation.Gene;
import com.genetic.program.model.generation.Generation;
import com.genetic.program.model.generation.SeedGenerationSettings;
import com.genetic.program.tree.BinaryMathTreeParser;

public class SeedGeneration {
	private static final Logger logger = LoggerFactory.getLogger(SeedGeneration.class);

	public static Generation getSeeds(final SeedGenerationSettings seedGenerationSettings, final String[] validOperators) {
		Generation generation = new Generation();
		
		for(int i = 0; i < seedGenerationSettings.getNumberOfSeeds(); i++){
			logger.trace("Start Expression " + i + ": ");
			String expression = generateFunction(seedGenerationSettings, validOperators);
			logger.trace("End Expression " + i + ": " + expression);
			
			Gene gene = new Gene();
			
			try {
				gene.setBinaryMathTree(BinaryMathTreeParser.stringEquationToBinaryMathTree(expression));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			generation.getGenes().add(gene);
			
			
		}
		
		return generation;
	}
	
	private static String generateFunction(SeedGenerationSettings seedGenerationSettings, String[] validOperators){
		StringBuilder stringBuilder = new StringBuilder();
		
		int numberOfOperators = MathUtil.randomNumber(seedGenerationSettings.getMinNumberOfOperators(), seedGenerationSettings.getMaxNumberOfOperators());
		
		String[] constantsAndVariables = randomConstantsAndVariablesGenerator(numberOfOperators + 1, seedGenerationSettings.getMinInt(), seedGenerationSettings.getMaxInt());
		

		int numberOfParentheses = MathUtil.randomNumber(seedGenerationSettings.getMinNumberOfParentheses(), seedGenerationSettings.getMaxNumberOfParentheses());
		

		 
		for(int i = 0; i < numberOfOperators; i++){
			
			if(i == 0){
				stringBuilder.append(constantsAndVariables[0]);
			}
			
			stringBuilder.append(randomOperator(validOperators));
			

			stringBuilder.append(constantsAndVariables[i + 1]);
		}
		
		
		String returnValue = stringBuilder.toString();
		
		
		if(numberOfParentheses > 0){
			Map<Integer, String> parentheses = new TreeMap<Integer, String>();
		
			int operatorAndOporandLength = numberOfOperators + numberOfOperators + 1;
			
			for(int i = 0; i < numberOfParentheses; i++){
				//Only support parentheses before and after constants or variables
				int rightParenthesesLocation = MathUtil.randomNumber(0, operatorAndOporandLength - 3);
				
				if(rightParenthesesLocation%2 == 1 && rightParenthesesLocation != 0){
					rightParenthesesLocation = rightParenthesesLocation - 1;
				}
				
				int leftParenthesesLocation = MathUtil.randomNumber(rightParenthesesLocation + 3, operatorAndOporandLength);
				
				if(leftParenthesesLocation%2 == 0 && leftParenthesesLocation != 0){
					leftParenthesesLocation = leftParenthesesLocation - 1;
				}
				
				logger.trace("rightParenthesesLocation: " + rightParenthesesLocation);
				logger.trace("leftParenthesesLocation: " + leftParenthesesLocation);
				
				if(!parentheses.containsKey(rightParenthesesLocation) && !parentheses.containsKey(leftParenthesesLocation)){
					parentheses.put(rightParenthesesLocation, "(");
					parentheses.put(leftParenthesesLocation, ")");
				}
			}
		
			
			StringBuilder stringBuilder2 = new StringBuilder();
			
			int lastValue = 0;
			for(Integer integer: parentheses.keySet()){
				if(integer > returnValue.length()){
					stringBuilder2.append(returnValue.substring(lastValue, integer-1));
					stringBuilder2.append(parentheses.get(integer));
					lastValue = returnValue.length();
				}
				else{
					stringBuilder2.append(returnValue.substring(lastValue, integer));
					stringBuilder2.append(parentheses.get(integer));
					lastValue = integer;
				}
			}
			
			stringBuilder2.append(returnValue.substring(lastValue, returnValue.length()));
			returnValue = stringBuilder2.toString();
		}
	
		return returnValue;
	}
	
	private static String[] randomConstantsAndVariablesGenerator(int numberOFVariableAndConstancts, int minInt,
			int maxInt) {
		
		String[] constantsAndVariables = new String[numberOFVariableAndConstancts];
		int numberOfConstants = MathUtil.randomNumber(1, 3);
		if(numberOfConstants > numberOFVariableAndConstancts){
			numberOfConstants = numberOFVariableAndConstancts;
		}
				
		int countNumberOfConstantsAdded = 0;
		while(numberOfConstants > countNumberOfConstantsAdded){
			int currentTry = MathUtil.randomNumber(0, numberOFVariableAndConstancts - 1);
			
			if(constantsAndVariables[currentTry] == null){
				constantsAndVariables[currentTry] = new String ("x");
				countNumberOfConstantsAdded++;
			}
		}

		for(int i = 0; i < constantsAndVariables.length; i++){
			if(constantsAndVariables[i] == null){
				constantsAndVariables[i] = MathUtil.randomNumber(minInt, maxInt).toString();
			}
		}
		
		
		return constantsAndVariables;
	}

	public static String randomOperator(String[] validOperators){
		return validOperators[MathUtil.randomNumber(0, validOperators.length-1)];
	}
}
