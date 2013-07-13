package com.genetic.program.tree;



/**
 * The class <code>OperandFactory</code> implements static methods that return instances of the class <code>{@link Operand}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:55 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class OperandFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	private OperandFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Operand}</code>.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	public static Operand createOperand() {
		return new ConstantNode();
	}


	/**
	 * Create an instance of the class <code>{@link Operand}</code>.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	public static Operand createOperand2() {
		return new VariableNode();
	}
}