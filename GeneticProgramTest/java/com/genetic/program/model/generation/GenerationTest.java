package com.genetic.program.model.generation;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GenerationTest</code> contains tests for the class <code>{@link Generation}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:56 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class GenerationTest {
	/**
	 * Run the Generation() constructor test.
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGeneration_1()
		throws Exception {
		Generation result = new Generation();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the int getGenerationMaxSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetGenerationMaxSize_1()
		throws Exception {
		Generation fixture = GenerationFactory.createGeneration();

		int result = fixture.getGenerationMaxSize();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getGenerationMaxSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetGenerationMaxSize_2()
		throws Exception {
		Generation fixture = GenerationFactory.createGeneration();

		int result = fixture.getGenerationMaxSize();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getGenerationMaxSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetGenerationMaxSize_3()
		throws Exception {
		Generation fixture = GenerationFactory.createGeneration();

		int result = fixture.getGenerationMaxSize();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the List<Gene> getGenes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetGenes_1()
		throws Exception {
		Generation fixture = GenerationFactory.createGeneration();

		List<Gene> result = fixture.getGenes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void setGenes(List<Gene>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetGenes_1()
		throws Exception {
		Generation fixture = GenerationFactory.createGeneration();
		ArrayList<Gene> genes = new ArrayList<Gene>();
		genes.add(GeneFactory.createGene());

		fixture.setGenes(genes);

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
		new org.junit.runner.JUnitCore().run(GenerationTest.class);
	}
}