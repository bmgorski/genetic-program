package com.genetic.program.tree;

import java.math.BigDecimal;
import java.util.HashMap;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AdditionNodeTest</code> contains tests for the class <code>{@link AdditionNode}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:56 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class AdditionNodeTest {
	/**
	 * Run the AdditionNode() constructor test.
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testAdditionNode_1()
		throws Exception {
		AdditionNode result = new AdditionNode();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the BigDecimal getValue(HashMap<String,BigDecimal>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		AdditionNode fixture = AdditionNodeFactory.createAdditionNode();
		HashMap<String, BigDecimal> variables = new HashMap();

		BigDecimal result = fixture.getValue(variables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.genetic.program.tree.AdditionNode.getValue(AdditionNode.java:24)
		assertNotNull(result);
	}

	/**
	 * Run the BigDecimal getValue(HashMap<String,BigDecimal>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetValue_2()
		throws Exception {
		AdditionNode fixture = AdditionNodeFactory.createAdditionNode();
		HashMap<String, BigDecimal> variables = new HashMap();

		BigDecimal result = fixture.getValue(variables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.genetic.program.tree.AdditionNode.getValue(AdditionNode.java:24)
		assertNotNull(result);
	}

	/**
	 * Run the int nodeType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testNodeType_1()
		throws Exception {
		AdditionNode fixture = AdditionNodeFactory.createAdditionNode();

		int result = fixture.nodeType();

		// add additional test code here
		assertEquals(3, result);
	}

	/**
	 * Run the String operatorStringEquivalant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testOperatorStringEquivalant_1()
		throws Exception {
		AdditionNode fixture = AdditionNodeFactory.createAdditionNode();

		String result = fixture.operatorStringEquivalant();

		// add additional test code here
		assertEquals("+", result);
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
		new org.junit.runner.JUnitCore().run(AdditionNodeTest.class);
	}
}