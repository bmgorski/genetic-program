package com.genetic.program.tree;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BinaryMathTreeParserTest</code> contains tests for the class <code>{@link BinaryMathTreeParser}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:56 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class BinaryMathTreeParserTest {
	/**
	 * Run the BinaryMathTreeParser() constructor test.
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testBinaryMathTreeParser_1()
		throws Exception {
		BinaryMathTreeParser result = new BinaryMathTreeParser();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Operator operatorStringToTreeNode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testOperatorStringToTreeNode_1()
		throws Exception {
		String newOperatorString = "";

		Operator result = BinaryMathTreeParser.operatorStringToTreeNode(newOperatorString);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Operator operatorStringToTreeNode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testOperatorStringToTreeNode_2()
		throws Exception {
		String newOperatorString = "";

		Operator result = BinaryMathTreeParser.operatorStringToTreeNode(newOperatorString);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Operator operatorStringToTreeNode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testOperatorStringToTreeNode_3()
		throws Exception {
		String newOperatorString = "";

		Operator result = BinaryMathTreeParser.operatorStringToTreeNode(newOperatorString);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Operator operatorStringToTreeNode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testOperatorStringToTreeNode_4()
		throws Exception {
		String newOperatorString = "";

		Operator result = BinaryMathTreeParser.operatorStringToTreeNode(newOperatorString);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Operator operatorStringToTreeNode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testOperatorStringToTreeNode_5()
		throws Exception {
		String newOperatorString = "";

		Operator result = BinaryMathTreeParser.operatorStringToTreeNode(newOperatorString);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the BinaryMathTree stringEquationToBinaryMathTree(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testStringEquationToBinaryMathTree_1()
		throws Exception {
		String equation = "2+2*2/2-2";

		BinaryMathTree result = BinaryMathTreeParser.stringEquationToBinaryMathTree(equation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Unknown Source)
		//       at java.util.Stack.pop(Unknown Source)
		//       at com.genetic.program.tree.BinaryMathTreeParser.reversPolishNotationToBinaryMathTree(BinaryMathTreeParser.java:96)
		//       at com.genetic.program.tree.BinaryMathTreeParser.stringEquationToBinaryMathTree(BinaryMathTreeParser.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the BinaryMathTree stringEquationToBinaryMathTree(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testStringEquationToBinaryMathTree_2()
		throws Exception {
		String equation = "2+2*2/2-2";

		BinaryMathTree result = BinaryMathTreeParser.stringEquationToBinaryMathTree(equation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Unknown Source)
		//       at java.util.Stack.pop(Unknown Source)
		//       at com.genetic.program.tree.BinaryMathTreeParser.reversPolishNotationToBinaryMathTree(BinaryMathTreeParser.java:96)
		//       at com.genetic.program.tree.BinaryMathTreeParser.stringEquationToBinaryMathTree(BinaryMathTreeParser.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the BinaryMathTree stringEquationToBinaryMathTree(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testStringEquationToBinaryMathTree_3()
		throws Exception {
		String equation = "2+2*2/2-2";

		BinaryMathTree result = BinaryMathTreeParser.stringEquationToBinaryMathTree(equation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Unknown Source)
		//       at java.util.Stack.pop(Unknown Source)
		//       at com.genetic.program.tree.BinaryMathTreeParser.reversPolishNotationToBinaryMathTree(BinaryMathTreeParser.java:96)
		//       at com.genetic.program.tree.BinaryMathTreeParser.stringEquationToBinaryMathTree(BinaryMathTreeParser.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the BinaryMathTree stringEquationToBinaryMathTree(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testStringEquationToBinaryMathTree_4()
		throws Exception {
		String equation = "2+2*2/2-2";

		BinaryMathTree result = BinaryMathTreeParser.stringEquationToBinaryMathTree(equation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.EmptyStackException
		//       at java.util.Stack.peek(Unknown Source)
		//       at java.util.Stack.pop(Unknown Source)
		//       at com.genetic.program.tree.BinaryMathTreeParser.reversPolishNotationToBinaryMathTree(BinaryMathTreeParser.java:96)
		//       at com.genetic.program.tree.BinaryMathTreeParser.stringEquationToBinaryMathTree(BinaryMathTreeParser.java:50)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BinaryMathTreeParserTest.class);
	}
}