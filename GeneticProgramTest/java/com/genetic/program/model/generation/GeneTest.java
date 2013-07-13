package com.genetic.program.model.generation;

import java.math.BigDecimal;
import org.junit.*;
import static org.junit.Assert.*;
import com.genetic.program.tree.BinaryMathTree;
import com.genetic.program.tree.BinaryMathTreeFactory;

/**
 * The class <code>GeneTest</code> contains tests for the class <code>{@link Gene}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:56 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class GeneTest {
	/**
	 * Run the Gene() constructor test.
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGene_1()
		throws Exception {
		Gene result = new Gene();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the int compareTo(Gene) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		Gene fixture = GeneFactory.createGene();
		Gene o = GeneFactory.createGene();

		int result = fixture.compareTo(o);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the BinaryMathTree getBinaryMathTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetBinaryMathTree_1()
		throws Exception {
		Gene fixture = GeneFactory.createGene();

		BinaryMathTree result = fixture.getBinaryMathTree();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the BigDecimal getFitnessValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetFitnessValue_1()
		throws Exception {
		Gene fixture = GeneFactory.createGene();

		BigDecimal result = fixture.getFitnessValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
		assertEquals(0, result.signum());
		assertEquals(0, result.scale());
		assertEquals(1, result.precision());
		assertEquals((byte) 0, result.byteValueExact());
		assertEquals(0, result.intValueExact());
		assertEquals(0L, result.longValueExact());
		assertEquals((short) 0, result.shortValueExact());
		assertEquals("0", result.toEngineeringString());
		assertEquals("0", result.toPlainString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
	}

	/**
	 * Run the boolean isRemoveFromGeneration() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testIsRemoveFromGeneration_1()
		throws Exception {
		Gene fixture = GeneFactory.createGene();

		boolean result = fixture.isRemoveFromGeneration();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isRemoveFromGeneration() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testIsRemoveFromGeneration_2()
		throws Exception {
		Gene fixture = GeneFactory.createGene();

		boolean result = fixture.isRemoveFromGeneration();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setBinaryMathTree(BinaryMathTree) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetBinaryMathTree_1()
		throws Exception {
		Gene fixture = GeneFactory.createGene();
		BinaryMathTree binaryMathTree = BinaryMathTreeFactory.createBinaryMathTree();

		fixture.setBinaryMathTree(binaryMathTree);

		// add additional test code here
	}

	/**
	 * Run the void setFitnessValue(BigDecimal) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetFitnessValue_1()
		throws Exception {
		Gene fixture = GeneFactory.createGene();
		BigDecimal score = new BigDecimal(1.0);

		fixture.setFitnessValue(score);

		// add additional test code here
	}

	/**
	 * Run the void setRemoveFromGeneration(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetRemoveFromGeneration_1()
		throws Exception {
		Gene fixture = GeneFactory.createGene();
		boolean removeFromGeneration = true;

		fixture.setRemoveFromGeneration(removeFromGeneration);

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
		new org.junit.runner.JUnitCore().run(GeneTest.class);
	}
}