package com.genetic.program.tree;



/**
 * The class <code>OperatorFactory</code> implements static methods that return instances of the class <code>{@link Operator}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:55 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class OperatorFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	private OperatorFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Operator}</code>.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	public static Operator createcreateDivisionNode() {
		return DivisionNodeFactory.createDivisionNode();
	}


	/**
	 * Create an instance of the class <code>{@link Operator}</code>.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	public static Operator createcreateMultiplicationNode() {
		return MultiplicationNodeFactory.createMultiplicationNode();
	}


	/**
	 * Create an instance of the class <code>{@link Operator}</code>.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	public static Operator createcreateSubtractionNode() {
		return SubtractionNodeFactory.createSubtractionNode();
	}
}