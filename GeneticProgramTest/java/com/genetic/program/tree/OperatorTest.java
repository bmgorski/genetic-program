package com.genetic.program.tree;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OperatorTest</code> contains tests for the class <code>{@link Operator}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:56 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class OperatorTest {
	/**
	 * Run the TreeNode getLeftNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetLeftNode_1()
		throws Exception {
		Operator fixture = OperatorFactory.createcreateMultiplicationNode();

		TreeNode result = fixture.getLeftNode();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getNumberOfChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetNumberOfChildren_1()
		throws Exception {
		Operator fixture = OperatorFactory.createcreateDivisionNode();

		int result = fixture.getNumberOfChildren();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.genetic.program.tree.Operator.getNumberOfChildren(Operator.java:33)
		assertEquals(0, result);
	}

	/**
	 * Run the int getNumberOfChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetNumberOfChildren_2()
		throws Exception {
		Operator fixture = OperatorFactory.createcreateMultiplicationNode();

		int result = fixture.getNumberOfChildren();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.genetic.program.tree.Operator.getNumberOfChildren(Operator.java:33)
		assertEquals(0, result);
	}

	/**
	 * Run the TreeNode getRightNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetRightNode_1()
		throws Exception {
		Operator fixture = OperatorFactory.createcreateSubtractionNode();

		TreeNode result = fixture.getRightNode();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void setTreeNodes(TreeNode,TreeNode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetTreeNodes_1()
		throws Exception {
		Operator fixture = OperatorFactory.createcreateDivisionNode();
		TreeNode treeNode1 = TreeNodeFactory.createcreateConstantNode();
		TreeNode treeNode2 = TreeNodeFactory.createcreateDivisionNode();

		fixture.setTreeNodes(treeNode1, treeNode2);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(OperatorTest.class);
	}
}