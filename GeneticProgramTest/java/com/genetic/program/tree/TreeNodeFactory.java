package com.genetic.program.tree;

import java.math.BigDecimal;

import com.genetic.program.math.MathUtil;



/**
 * The class <code>TreeNodeFactory</code> implements static methods that return instances of the class <code>{@link TreeNode}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:55 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class TreeNodeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	private TreeNodeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link TreeNode}</code>.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	public static TreeNode createcreateConstantNode() {
		ConstantNode constantNode = ConstantNodeFactory.createConstantNode();
		constantNode.setLeafValue(MathUtil.stringToBigDecimalWithScale("5"));
		return constantNode;
	}


	/**
	 * Create an instance of the class <code>{@link TreeNode}</code>.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	public static TreeNode createcreateDivisionNode() {
		return DivisionNodeFactory.createDivisionNode();
	}


	/**
	 * Create an instance of the class <code>{@link TreeNode}</code>.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	public static TreeNode createcreateMultiplicationNode() {
		return MultiplicationNodeFactory.createMultiplicationNode();
	}


	/**
	 * Create an instance of the class <code>{@link TreeNode}</code>.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	public static TreeNode createcreateSubtractionNode() {
		return SubtractionNodeFactory.createSubtractionNode();
	}


	/**
	 * Create an instance of the class <code>{@link TreeNode}</code>.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	public static TreeNode createcreateVariableNode() {
		return VariableNodeFactory.createVariableNode();
	}
}