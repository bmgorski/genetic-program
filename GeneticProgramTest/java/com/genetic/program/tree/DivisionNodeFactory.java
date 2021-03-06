package com.genetic.program.tree;



/**
 * The class <code>DivisionNodeFactory</code> implements static methods that return instances of the class <code>{@link DivisionNode}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:55 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class DivisionNodeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	private DivisionNodeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link DivisionNode}</code>.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	public static DivisionNode createDivisionNode() {
		DivisionNode divisionNode = new DivisionNode();
		divisionNode.setTreeNodes(ConstantNodeFactory.createConstantNode(), ConstantNodeFactory.createConstantNode());
		return divisionNode;
	}
}