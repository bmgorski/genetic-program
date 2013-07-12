package com.genetic.program.math;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genetic.program.tree.BinaryMathTree;

public class MathUtil {
	private static final Logger logger = LoggerFactory
			.getLogger(MathUtil.class);
	
	public static final int APPLICATION_SCALE = 10;
	public static final int APPLICATION_ROUNDING = BigDecimal.ROUND_DOWN;
	public static final int ENVIRONMENT_MULTIPLIER = 10;

	/**
	 * 
	 * @param min
	 *            the minimum the random number should be
	 * @param max
	 *            the maximum the random number should be
	 * @return an int between or equal to min and max null if min > max
	 * 
	 * 
	 */
	public static Integer randomNumber(int min, int max) {
		if (min == max) {
			return min;
		}
		if (min > max) {
			return null;
		}

		return min + (int) (Math.random() * ((max - min) + 1));
	}
	
	/**
	 * 
	 * @param a in the quadratic formula
	 * @param b in the quadratic formula
	 * @return xVertex
	 */
	public static BigDecimal xVertex(final BigDecimal a, final BigDecimal b){
		BigDecimal m = stringToBigDecimalWithScale("2");
		
		BigDecimal b2 = b.negate();
		BigDecimal a2 = a.multiply(m);
		
		return b2.divide(a2, APPLICATION_SCALE, APPLICATION_ROUNDING);
	}

	public static List<BigDecimal> calculateEnvironmentVariables(BigDecimal xVertex, Integer enviromentSize) {
		List<BigDecimal> environmentVariables = new ArrayList<BigDecimal>();
		
		environmentVariables.add(xVertex);
		int numberOfPairs = enviromentSize/2;
		for(int i = 1; i <= numberOfPairs; i++){
			Integer thisMultiplier = ENVIRONMENT_MULTIPLIER * i;
			BigDecimal thisMultiplierBD = stringToBigDecimalWithScale(thisMultiplier.toString());
			
			logger.trace("environmentVariables: " + environmentVariables);
			
			environmentVariables.add(xVertex.add(thisMultiplierBD));
			environmentVariables.add(xVertex.add(thisMultiplierBD.negate()));
			
		}
		
		logger.trace("environmentVariables: " + environmentVariables);
		logger.trace("environmentVariablesSize: " + environmentVariables.size());
		
		return environmentVariables;
	}
	
	public static double stringToDouble(String doubleString){
		return MathUtil.stringToBigDecimalWithScale(doubleString).doubleValue();
	}
	
	public static List<BigDecimal> generateBinaryMathTreeFitness(List<BigDecimal> environments, BinaryMathTree binaryMathTree){
		List<BigDecimal> enviromnentTargets = new ArrayList<BigDecimal>();
		
		for(BigDecimal bigDecimal : environments){
			HashMap<String, BigDecimal> variables = new HashMap<String, BigDecimal>();
			variables.put("x", bigDecimal);
			
			BigDecimal enviromnentTarget = binaryMathTree.getValue(variables);
			
			logger.trace(binaryMathTree.getRootNode().nodeType() + "");
			
			logger.trace("EnviromnentTargets: " + enviromnentTarget);
			enviromnentTargets.add(enviromnentTarget);
		}
		
		logger.trace("binaryMathTreeScores: " + enviromnentTargets);
		logger.trace("binaryMathTreeScores: " + enviromnentTargets.size());
		
		return enviromnentTargets;
	}
	
	public static BigDecimal stringToBigDecimalWithScale(String number){
		BigDecimal bigDecimal = new BigDecimal(number);
		bigDecimal.setScale(APPLICATION_SCALE);
		
		return bigDecimal;
	}
}