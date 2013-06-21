package com.genetic.program.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GeneticConstants {
	private static final int MAX_NUMBER_OF_THREADS = 10;
	public static final ExecutorService pool = Executors
			.newFixedThreadPool(MAX_NUMBER_OF_THREADS);
	
	/**
	 * number 1 - 100
	 * 
	 * 1 = 1% to be a CONSTANT
	 * 
	 */
	public static final int CONSTANT_TO_VARIABLE_RATIO = 75;
	public static final int PERCENT_OPERATOR_TO_OPERAND = 50;
}