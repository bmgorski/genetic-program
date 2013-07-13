package com.genetic.program.math;



/**
 * The class <code>MathUtilFactory</code> implements static methods that return instances of the class <code>{@link MathUtil}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:55 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class MathUtilFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	private MathUtilFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link MathUtil}</code>.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	public static MathUtil createMathUtil() {
		return new MathUtil();
	}
}