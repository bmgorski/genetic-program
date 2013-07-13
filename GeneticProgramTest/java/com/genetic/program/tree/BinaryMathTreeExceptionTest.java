package com.genetic.program.tree;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BinaryMathTreeExceptionTest</code> contains tests for the class <code>{@link BinaryMathTreeException}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:56 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class BinaryMathTreeExceptionTest {
	/**
	 * Run the BinaryMathTreeException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testBinaryMathTreeException_1()
		throws Exception {
		String message = "";

		BinaryMathTreeException result = new BinaryMathTreeException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("com.genetic.program.tree.BinaryMathTreeException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
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
		new org.junit.runner.JUnitCore().run(BinaryMathTreeExceptionTest.class);
	}
}