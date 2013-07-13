package com.genetic.program.model.generation;

import com.genetic.program.math.MathUtil;
import com.genetic.program.tree.BinaryMathTree;
import com.genetic.program.tree.BinaryMathTreeException;
import com.genetic.program.tree.BinaryMathTreeParser;
import com.genetic.program.util.CalculateFitness;
import com.genetic.program.util.SeedGeneration;



/**
 * The class <code>GenerationFactory</code> implements static methods that return instances of the class <code>{@link Generation}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:55 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class GenerationFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	private GenerationFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Generation}</code>.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	public static Generation createGeneration() {
		return new Generation();
	}
	
	public static Generation createGeneration(int numberOfSeeds) throws BinaryMathTreeException {
		Settings settings = new Settings();
		
		settings.setEnvironmentVariables(
				MathUtil.calculateEnvironmentVariables(
					MathUtil.xVertex(settings.getQuadraticA(), settings.getQuadraticB()), 
					settings.getEnviromentSize()
				)
		);
		
		BinaryMathTree binaryMathTree = BinaryMathTreeParser.stringEquationToBinaryMathTree(settings.getTargetFunction());
		settings.setEnviromentFitnessTargets(MathUtil.generateBinaryMathTreeFitness(settings.getEnvironmentVariables(), binaryMathTree));

		
		settings.getSeedGenerationSettings().setNumberOfSeeds(numberOfSeeds);
		
		Generation oldGeneration = SeedGeneration.getSeeds(settings.getSeedGenerationSettings(), settings.getValidOperators());
		
		CalculateFitness.caluclateFitnessValuesAndPrune(oldGeneration, settings.getEnvironmentVariables(), settings.getEnviromentFitnessTargets(), settings.getMaxFitnessValue());

		return oldGeneration;
	}
}