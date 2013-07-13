package com.genetic.program.util;

import com.rits.cloning.Cloner;


/**
 * The class <code>GenerationToGenerationFactory</code> implements static methods that return instances of the class <code>{@link GenerationToGeneration}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:55 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class GenerationToGenerationFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	private GenerationToGenerationFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link GenerationToGeneration}</code>.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	public static GenerationToGeneration createGenerationToGeneration() {
		return new GenerationToGeneration(new Cloner());
	}
}