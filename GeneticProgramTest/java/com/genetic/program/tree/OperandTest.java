package com.genetic.program.tree;

import java.math.BigDecimal;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OperandTest</code> contains tests for the class <code>{@link Operand}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:55 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class OperandTest {
	/**
	 * Run the BigDecimal getLeafValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	@Test
	public void testGetLeafValue_1()
		throws Exception {
		Operand fixture = OperandFactory.createOperand2();

		BigDecimal result = fixture.getLeafValue();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getNumberOfChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	@Test
	public void testGetNumberOfChildren_1()
		throws Exception {
		Operand fixture = OperandFactory.createOperand();

		int result = fixture.getNumberOfChildren();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setLeafValue(BigDecimal) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	@Test
	public void testSetLeafValue_1()
		throws Exception {
		Operand fixture = OperandFactory.createOperand();
		BigDecimal leafValue = new BigDecimal(1.0);

		fixture.setLeafValue(leafValue);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(OperandTest.class);
	}
}