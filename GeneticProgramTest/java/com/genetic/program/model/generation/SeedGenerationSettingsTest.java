package com.genetic.program.model.generation;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SeedGenerationSettingsTest</code> contains tests for the class <code>{@link SeedGenerationSettings}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:56 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class SeedGenerationSettingsTest {
	/**
	 * Run the SeedGenerationSettings() constructor test.
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSeedGenerationSettings_1()
		throws Exception {
		SeedGenerationSettings result = new SeedGenerationSettings();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the int getMaxInt() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetMaxInt_1()
		throws Exception {
		SeedGenerationSettings fixture = SeedGenerationSettingsFactory.createSeedGenerationSettings();

		int result = fixture.getMaxInt();

		// add additional test code here
		assertEquals(9, result);
	}

	/**
	 * Run the int getMaxNumberOfOperators() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetMaxNumberOfOperators_1()
		throws Exception {
		SeedGenerationSettings fixture = SeedGenerationSettingsFactory.createSeedGenerationSettings();

		int result = fixture.getMaxNumberOfOperators();

		// add additional test code here
		assertEquals(8, result);
	}

	/**
	 * Run the int getMaxNumberOfParentheses() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetMaxNumberOfParentheses_1()
		throws Exception {
		SeedGenerationSettings fixture = SeedGenerationSettingsFactory.createSeedGenerationSettings();

		int result = fixture.getMaxNumberOfParentheses();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getMinInt() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetMinInt_1()
		throws Exception {
		SeedGenerationSettings fixture = SeedGenerationSettingsFactory.createSeedGenerationSettings();

		int result = fixture.getMinInt();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getMinNumberOfOperators() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetMinNumberOfOperators_1()
		throws Exception {
		SeedGenerationSettings fixture = SeedGenerationSettingsFactory.createSeedGenerationSettings();

		int result = fixture.getMinNumberOfOperators();

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the int getMinNumberOfParentheses() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetMinNumberOfParentheses_1()
		throws Exception {
		SeedGenerationSettings fixture = SeedGenerationSettingsFactory.createSeedGenerationSettings();

		int result = fixture.getMinNumberOfParentheses();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getNumberOfSeeds() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetNumberOfSeeds_1()
		throws Exception {
		SeedGenerationSettings fixture = SeedGenerationSettingsFactory.createSeedGenerationSettings();

		int result = fixture.getNumberOfSeeds();

		// add additional test code here
		assertEquals(10000, result);
	}

	/**
	 * Run the void setMaxInt(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetMaxInt_1()
		throws Exception {
		SeedGenerationSettings fixture = SeedGenerationSettingsFactory.createSeedGenerationSettings();
		int maxInt = 1;

		fixture.setMaxInt(maxInt);

		// add additional test code here
	}

	/**
	 * Run the void setMaxNumberOfOperators(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetMaxNumberOfOperators_1()
		throws Exception {
		SeedGenerationSettings fixture = SeedGenerationSettingsFactory.createSeedGenerationSettings();
		int maxNumberOfOperators = 1;

		fixture.setMaxNumberOfOperators(maxNumberOfOperators);

		// add additional test code here
	}

	/**
	 * Run the void setMaxNumberOfParentheses(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetMaxNumberOfParentheses_1()
		throws Exception {
		SeedGenerationSettings fixture = SeedGenerationSettingsFactory.createSeedGenerationSettings();
		int maxNumberOfParentheses = 1;

		fixture.setMaxNumberOfParentheses(maxNumberOfParentheses);

		// add additional test code here
	}

	/**
	 * Run the void setMinInt(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetMinInt_1()
		throws Exception {
		SeedGenerationSettings fixture = SeedGenerationSettingsFactory.createSeedGenerationSettings();
		int minInt = 1;

		fixture.setMinInt(minInt);

		// add additional test code here
	}

	/**
	 * Run the void setMinNumberOfOperators(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetMinNumberOfOperators_1()
		throws Exception {
		SeedGenerationSettings fixture = SeedGenerationSettingsFactory.createSeedGenerationSettings();
		int minNumberOfOperators = 1;

		fixture.setMinNumberOfOperators(minNumberOfOperators);

		// add additional test code here
	}

	/**
	 * Run the void setMinNumberOfParentheses(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetMinNumberOfParentheses_1()
		throws Exception {
		SeedGenerationSettings fixture = SeedGenerationSettingsFactory.createSeedGenerationSettings();
		int minNumberOfParentheses = 1;

		fixture.setMinNumberOfParentheses(minNumberOfParentheses);

		// add additional test code here
	}

	/**
	 * Run the void setNumberOfSeeds(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetNumberOfSeeds_1()
		throws Exception {
		SeedGenerationSettings fixture = SeedGenerationSettingsFactory.createSeedGenerationSettings();
		int numberOfSeeds = 1;

		fixture.setNumberOfSeeds(numberOfSeeds);

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
		new org.junit.runner.JUnitCore().run(SeedGenerationSettingsTest.class);
	}
}