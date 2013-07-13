package com.genetic.program.util;

import org.junit.*;
import static org.junit.Assert.*;
import com.genetic.program.model.generation.Generation;
import com.genetic.program.model.generation.GenerationFactory;
import com.rits.cloning.Cloner;

/**
 * The class <code>GenerationToGenerationTest</code> contains tests for the class <code>{@link GenerationToGeneration}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:56 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class GenerationToGenerationTest {
	/**
	 * Run the GenerationToGeneration(Cloner) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGenerationToGeneration_1()
		throws Exception {
		Cloner cloner = new Cloner();

		GenerationToGeneration result = new GenerationToGeneration(cloner);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Generation populate(Generation,String[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testPopulate_1()
		throws Exception {
		GenerationToGeneration fixture = GenerationToGenerationFactory.createGenerationToGeneration();
		Generation oldGeneration = GenerationFactory.createGeneration();
		String[] validOperators = new String[] {};
		int minInt = 1;
		int maxInt = 1;

		Generation result = fixture.populate(oldGeneration, validOperators, minInt, maxInt);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getGenerationMaxSize());
	}

	/**
	 * Run the Generation populate(Generation,String[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testPopulate_2()
		throws Exception {
		GenerationToGeneration fixture = GenerationToGenerationFactory.createGenerationToGeneration();
		Generation oldGeneration = GenerationFactory.createGeneration();
		String[] validOperators = new String[] {};
		int minInt = 1;
		int maxInt = 1;

		Generation result = fixture.populate(oldGeneration, validOperators, minInt, maxInt);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getGenerationMaxSize());
	}

	/**
	 * Run the Generation populate(Generation,String[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testPopulate_3()
		throws Exception {
		GenerationToGeneration fixture = GenerationToGenerationFactory.createGenerationToGeneration();
		Generation oldGeneration = GenerationFactory.createGeneration();
		String[] validOperators = new String[] {};
		int minInt = 1;
		int maxInt = 1;

		Generation result = fixture.populate(oldGeneration, validOperators, minInt, maxInt);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getGenerationMaxSize());
	}

	/**
	 * Run the Generation populate(Generation,String[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testPopulate_4()
		throws Exception {
		GenerationToGeneration fixture = GenerationToGenerationFactory.createGenerationToGeneration();
		Generation oldGeneration = GenerationFactory.createGeneration();
		String[] validOperators = new String[] {};
		int minInt = 1;
		int maxInt = 1;

		Generation result = fixture.populate(oldGeneration, validOperators, minInt, maxInt);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getGenerationMaxSize());
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
		new org.junit.runner.JUnitCore().run(GenerationToGenerationTest.class);
	}
}