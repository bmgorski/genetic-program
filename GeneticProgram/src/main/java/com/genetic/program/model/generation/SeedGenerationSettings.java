package com.genetic.program.model.generation;

public class SeedGenerationSettings {
	private int numberOfSeeds = 500;
	private int maxNumberOfOperators = 7;
	private int minNumberOfOperators = 2;
	private int maxNumberOfParentheses = 1;
	private int minNumberOfParentheses = 0;
	
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
