package com.genetic.program.model.generation;



/**
 * The class <code>GeneFactory</code> implements static methods that return instances of the class <code>{@link Gene}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:55 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class GeneFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	private GeneFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Gene}</code>.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	public static Gene createGene() {
		return new Gene();
	}
}