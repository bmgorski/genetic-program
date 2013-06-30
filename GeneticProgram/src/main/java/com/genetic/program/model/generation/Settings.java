package com.genetic.program.model.generation;

import java.math.BigDecimal;
import java.util.List;

public class Settings {
	private SeedGenerationSettings seedGenerationSettings = new SeedGenerationSettings();
	private String targetFunction = "(2*x*x-1)/2";
	
	private BigDecimal quadraticA = new BigDecimal("2");
	private BigDecimal quadraticB = BigDecimal.ZERO;
	private Integer enviromentSize = 200;
	private BigDecimal maxFitnessValue = new BigDecimal("10000");
	
	private List<BigDecimal> environmentVariables;
	private List<BigDecimal> enviromentFitnessTargets;
	private String[] validOperators = new String[]{"*","/","+","-"};
	
	public Settings() {

	}

	/**
	 * @return the environmentVariables
	 */
	public List<BigDecimal> getEnvironmentVariables() {
		return environmentVariables;
	}

	/**
	 * @param environmentVariables the environmentVariables to set
	 */
	public void setEnvironmentVariables(List<BigDecimal> environmentVariables) {
		this.environmentVariables = environmentVariables;
	}

	/**
	 * @return the enviromentFitnessTargets
	 */
	public List<BigDecimal> getEnviromentFitnessTargets() {
		return enviromentFitnessTargets;
	}

	/**
	 * @param enviromentFitnessTargets the enviromentFitnessTargets to set
	 */
	public void setEnviromentFitnessTargets(
			List<BigDecimal> enviromentFitnessTargets) {
		this.enviromentFitnessTargets = enviromentFitnessTargets;
	}

	/**
	 * @return the enviromentSize
	 */
	public Integer getEnviromentSize() {
		return enviromentSize;
	}

	/**
	 * @param enviromentSize the enviromentSize to set
	 */
	public void setEnviromentSize(Integer enviromentSize) {
		this.enviromentSize = enviromentSize;
	}

	/**
	 * @return the seedGenerationSettings
	 */
	public SeedGenerationSettings getSeedGenerationSettings() {
		return seedGenerationSettings;
	}

	/**
	 * @param seedGenerationSettings the seedGenerationSettings to set
	 */
	public void setSeedGenerationSettings(
			SeedGenerationSettings seedGenerationSettings) {
		this.seedGenerationSettings = seedGenerationSettings;
	}

	/**
	 * @return the targetFunction
	 */
	public String getTargetFunction() {
		return targetFunction;
	}

	/**
	 * @param targetFunction the targetFunction to set
	 */
	public void setTargetFunction(String targetFunction) {
		this.targetFunction = targetFunction;
	}

	/**
	 * @return the quadraticA
	 */
	public BigDecimal getQuadraticA() {
		return quadraticA;
	}

	/**
	 * @param quadraticA the quadraticA to set
	 */
	public void setQuadraticA(BigDecimal quadraticA) {
		this.quadraticA = quadraticA;
	}

	/**
	 * @return the quadraticB
	 */
	public BigDecimal getQuadraticB() {
		return quadraticB;
	}

	/**
	 * @param quadraticB the quadraticB to set
	 */
	public void setQuadraticB(BigDecimal quadraticB) {
		this.quadraticB = quadraticB;
	}

	public String[] getValidOperators() {
		return validOperators;
	}

	public void setValidOperators(String[] validOperators) {
		this.validOperators = validOperators;
	}

	public BigDecimal getMaxFitnessValue() {
		return maxFitnessValue;
	}

	public void setMaxFitnessValue(BigDecimal maxFitnessValue) {
		this.maxFitnessValue = maxFitnessValue;
	}
}