package com.genetic.program.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GeneticConstants {
	private static final int MAX_NUMBER_OF_THREADS = 10;
	public static final ExecutorService pool = Executors
			.newFixedThreadPool(MAX_NUMBER_OF_THREADS);
	
}