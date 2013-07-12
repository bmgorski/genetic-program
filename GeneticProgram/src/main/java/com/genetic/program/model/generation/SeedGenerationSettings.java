package com.genetic.program.model.generation;

public class SeedGenerationSettings {
	private int numberOfSeeds = 10000;
	private int maxNumberOfOperators = 6;
	private int minNumberOfOperators = 3;
	private int maxNumberOfParentheses = 1;
	private int minNumberOfParentheses = 0;
	
	/**
	 * currently only supports 1 threw 9
	 */
	private int minInt = 1;
	private int maxInt = 9;
	
	public int getMinInt() {
		return minInt;
	}

	public void setMinInt(int minInt) {
		this.minInt = minInt;
	}

	public int getMaxInt() {
		return maxInt;
	}

	public void setMaxInt(int maxInt) {
		this.maxInt = maxInt;
	}

	public int getMaxNumberOfOperators() {
		return maxNumberOfOperators;
	}

	public void setMaxNumberOfOperators(int maxNumberOfOperators) {
		this.maxNumberOfOperators = maxNumberOfOperators;
	}

	public int getMinNumberOfOperators() {
		return minNumberOfOperators;
	}

	public void setMinNumberOfOperators(int minNumberOfOperators) {
		this.minNumberOfOperators = minNumberOfOperators;
	}

	public int getMaxNumberOfParentheses() {
		return maxNumberOfParentheses;
	}

	public void setMaxNumberOfParentheses(int maxNumberOfParentheses) {
		this.maxNumberOfParentheses = maxNumberOfParentheses;
	}

	public int getMinNumberOfParentheses() {
		return minNumberOfParentheses;
	}

	public void setMinNumberOfParentheses(int minNumberOfParentheses) {
		this.minNumberOfParentheses = minNumberOfParentheses;
	}

	public int getNumberOfSeeds() {
		return numberOfSeeds;
	}

	public void setNumberOfSeeds(int numberOfSeeds) {
		this.numberOfSeeds = numberOfSeeds;
	}
}
