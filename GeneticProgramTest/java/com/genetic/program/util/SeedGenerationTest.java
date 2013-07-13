package com.genetic.program.util;

import org.junit.*;
import static org.junit.Assert.*;
import com.genetic.program.model.generation.Generation;
import com.genetic.program.model.generation.SeedGenerationSettings;
import com.genetic.program.model.generation.SeedGenerationSettingsFactory;

/**
 * The class <code>SeedGenerationTest</code> contains tests for the class <code>{@link SeedGeneration}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:55 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class SeedGenerationTest {
	/**
	 * Run the SeedGeneration() constructor test.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	@Test
	public void testSeedGeneration_1()
		throws Exception {
		SeedGeneration result = new SeedGeneration();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Generation getSeeds(SeedGenerationSettings,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	@Test
	public void testGetSeeds_1()
		throws Exception {
		SeedGenerationSettings seedGenerationSettings = SeedGenerationSettingsFactory.createSeedGenerationSettings();
		String[] validOperators = new String[] {"+"};

		Generation result = SeedGeneration.getSeeds(seedGenerationSettings, validOperators);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.genetic.program.util.SeedGeneration.randomOperator(SeedGeneration.java:152)
		//       at com.genetic.program.util.SeedGeneration.generateFunction(SeedGeneration.java:60)
		//       at com.genetic.program.util.SeedGeneration.getSeeds(SeedGeneration.java:23)
		assertNotNull(result);
	}

	/**
	 * Run the Generation getSeeds(SeedGenerationSettings,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	@Test
	public void testGetSeeds_2()
		throws Exception {
		SeedGenerationSettings seedGenerationSettings = SeedGenerationSettingsFactory.createSeedGenerationSettings();
		String[] validOperators = new String[] {};

		Generation result = SeedGeneration.getSeeds(seedGenerationSettings, validOperators);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.genetic.program.util.SeedGeneration.randomOperator(SeedGeneration.java:152)
		//       at com.genetic.program.util.SeedGeneration.generateFunction(SeedGeneration.java:60)
		//       at com.genetic.program.util.SeedGeneration.getSeeds(SeedGeneration.java:23)
		assertNotNull(result);
	}

	/**
	 * Run the String randomOperator(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	@Test
	public void testRandomOperator_1()
		throws Exception {
		String[] validOperators = new String[] {};

		String result = SeedGeneration.randomOperator(validOperators);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.genetic.program.util.SeedGeneration.randomOperator(SeedGeneration.java:152)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(SeedGenerationTest.class);
	}
}