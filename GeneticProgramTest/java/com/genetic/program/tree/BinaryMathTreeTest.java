package com.genetic.program.tree;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BinaryMathTreeTest</code> contains tests for the class <code>{@link BinaryMathTree}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:55 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class BinaryMathTreeTest {
	/**
	 * Run the BinaryMathTree() constructor test.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	@Test
	public void testBinaryMathTree_1()
		throws Exception {
		BinaryMathTree result = new BinaryMathTree();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the TreeNode getRootNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	@Test
	public void testGetRootNode_1()
		throws Exception {
		BinaryMathTree fixture = BinaryMathTreeFactory.createBinaryMathTree();

		TreeNode result = fixture.getRootNode();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the BigDecimal getValue(HashMap<String,BigDecimal>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		BinaryMathTree fixture = BinaryMathTreeFactory.createBinaryMathTree();
		HashMap<String, BigDecimal> variables = new HashMap();

		BigDecimal result = fixture.getValue(variables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.genetic.program.tree.BinaryMathTree.getValue(BinaryMathTree.java:28)
		assertNotNull(result);
	}

	/**
	 * Run the List<String> getVariableNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	@Test
	public void testGetVariableNames_1()
		throws Exception {
		BinaryMathTree fixture = BinaryMathTreeFactory.createBinaryMathTree();

		List<String> result = fixture.getVariableNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<TreeNode> levelorder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	@Test
	public void testLevelorder_1()
		throws Exception {
		BinaryMathTree fixture = BinaryMathTreeFactory.createBinaryMathTree();

		List<TreeNode> result = fixture.levelorder();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.genetic.program.tree.BinaryMathTree.levelorder(BinaryMathTree.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the List<TreeNode> levelorder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	@Test
	public void testLevelorder_2()
		throws Exception {
		BinaryMathTree fixture = BinaryMathTreeFactory.createBinaryMathTree();

		List<TreeNode> result = fixture.levelorder();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.genetic.program.tree.BinaryMathTree.levelorder(BinaryMathTree.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the List<TreeNode> levelorder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	@Test
	public void testLevelorder_3()
		throws Exception {
		BinaryMathTree fixture = BinaryMathTreeFactory.createBinaryMathTree();

		List<TreeNode> result = fixture.levelorder();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.genetic.program.tree.BinaryMathTree.levelorder(BinaryMathTree.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the List<TreeNode> levelorder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	@Test
	public void testLevelorder_4()
		throws Exception {
		BinaryMathTree fixture = BinaryMathTreeFactory.createBinaryMathTree();

		List<TreeNode> result = fixture.levelorder();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.genetic.program.tree.BinaryMathTree.levelorder(BinaryMathTree.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the void setRootNode(TreeNode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	@Test
	public void testSetRootNode_1()
		throws Exception {
		BinaryMathTree fixture = BinaryMathTreeFactory.createBinaryMathTree();
		TreeNode rootNode = TreeNodeFactory.createcreateConstantNode();

		fixture.setRootNode(rootNode);

		// add additional test code here
	}

	/**
	 * Run the int size() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	@Test
	public void testSize_1()
		throws Exception {
		BinaryMathTree fixture = BinaryMathTreeFactory.createBinaryMathTree();

		int result = fixture.size();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.genetic.program.tree.BinaryMathTree.size(BinaryMathTree.java:36)
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
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
	 * @generatedBy CodePro at 7/12/13 4:55 PM
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
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BinaryMathTreeTest.class);
	}
}