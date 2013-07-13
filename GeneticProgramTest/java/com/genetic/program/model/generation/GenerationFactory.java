package com.genetic.program.model.generation;



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
}