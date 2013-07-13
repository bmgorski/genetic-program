package com.genetic.program.tree;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 7/12/13 4:56 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	BinaryMathTreeTest.class,
	TreeNodeTest.class,
	MultiplicationNodeTest.class,
	OperatorTest.class,
	AdditionNodeTest.class,
	DivisionNodeTest.class,
	ReversePolishNotationTest.class,
	BinaryMathTreeParserTest.class,
	VariableNodeTest.class,
	SubtractionNodeTest.class,
	ConstantNodeTest.class,
	OperandTest.class,
	BinaryMathTreeExceptionTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
