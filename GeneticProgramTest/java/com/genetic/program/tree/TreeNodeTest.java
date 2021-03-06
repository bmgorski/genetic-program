package com.genetic.program.tree;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TreeNodeTest</code> contains tests for the class <code>{@link TreeNode}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:56 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class TreeNodeTest {
	/**
	 * Run the TreeNode getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetParent_1()
		throws Exception {
		TreeNode fixture = TreeNodeFactory.createcreateConstantNode();

		TreeNode result = fixture.getParent();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void setParent(TreeNode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetParent_1()
		throws Exception {
		TreeNode fixture = TreeNodeFactory.createcreateDivisionNode();
		TreeNode parent = TreeNodeFactory.createcreateMultiplicationNode();

		fixture.setParent(parent);

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
		new org.junit.runner.JUnitCore().run(TreeNodeTest.class);
	}
}