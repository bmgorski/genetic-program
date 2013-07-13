package com.genetic.program.math;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import com.genetic.program.tree.BinaryMathTree;
import com.genetic.program.tree.BinaryMathTreeFactory;

/**
 * The class <code>MathUtilTest</code> contains tests for the class <code>{@link MathUtil}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:56 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class MathUtilTest {
	/**
	 * Run the MathUtil() constructor test.
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testMathUtil_1()
		throws Exception {
		MathUtil result = new MathUtil();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the List<BigDecimal> calculateEnvironmentVariables(BigDecimal,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testCalculateEnvironmentVariables_1()
		throws Exception {
		BigDecimal xVertex = new BigDecimal(1.0);
		Integer enviromentSize = new Integer(1);

		List<BigDecimal> result = MathUtil.calculateEnvironmentVariables(xVertex, enviromentSize);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<BigDecimal> calculateEnvironmentVariables(BigDecimal,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testCalculateEnvironmentVariables_2()
		throws Exception {
		BigDecimal xVertex = new BigDecimal(1.0);
		Integer enviromentSize = new Integer(1);

		List<BigDecimal> result = MathUtil.calculateEnvironmentVariables(xVertex, enviromentSize);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<BigDecimal> generateBinaryMathTreeFitness(List<BigDecimal>,BinaryMathTree) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGenerateBinaryMathTreeFitness_1()
		throws Exception {
		List<BigDecimal> environments = new ArrayList<BigDecimal>();
		BinaryMathTree binaryMathTree = BinaryMathTreeFactory.createBinaryMathTree();

		List<BigDecimal> result = MathUtil.generateBinaryMathTreeFitness(environments, binaryMathTree);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<BigDecimal> generateBinaryMathTreeFitness(List<BigDecimal>,BinaryMathTree) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGenerateBinaryMathTreeFitness_2()
		throws Exception {
		List<BigDecimal> environments = new ArrayList<BigDecimal>();
		BinaryMathTree binaryMathTree = BinaryMathTreeFactory.createBinaryMathTree();

		List<BigDecimal> result = MathUtil.generateBinaryMathTreeFitness(environments, binaryMathTree);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Integer randomNumber(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testRandomNumber_1()
		throws Exception {
		int min = 1;
		int max = 1;

		Integer result = MathUtil.randomNumber(min, max);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Integer randomNumber(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testRandomNumber_2()
		throws Exception {
		int min = 1;
		int max = 1;

		Integer result = MathUtil.randomNumber(min, max);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Integer randomNumber(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testRandomNumber_3()
		throws Exception {
		int min = 1;
		int max = 1;

		Integer result = MathUtil.randomNumber(min, max);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the BigDecimal stringToBigDecimalWithScale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testStringToBigDecimalWithScale_1()
		throws Exception {
		String number = "2";

		BigDecimal result = MathUtil.stringToBigDecimalWithScale(number);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException
		//       at java.math.BigDecimal.<init>(Unknown Source)
		//       at java.math.BigDecimal.<init>(Unknown Source)
		//       at com.genetic.program.math.MathUtil.stringToBigDecimalWithScale(MathUtil.java:104)
		assertNotNull(result);
	}

	/**
	 * Run the double stringToDouble(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testStringToDouble_1()
		throws Exception {
		String doubleString = "";

		double result = MathUtil.stringToDouble(doubleString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException
		//       at java.math.BigDecimal.<init>(Unknown Source)
		//       at java.math.BigDecimal.<init>(Unknown Source)
		//       at com.genetic.program.math.MathUtil.stringToBigDecimalWithScale(MathUtil.java:104)
		//       at com.genetic.program.math.MathUtil.stringToDouble(MathUtil.java:79)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the BigDecimal xVertex(BigDecimal,BigDecimal) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testXVertex_1()
		throws Exception {
		BigDecimal a = new BigDecimal(1.0);
		BigDecimal b = new BigDecimal(1.0);

		BigDecimal result = MathUtil.xVertex(a, b);

		// add additional test code here
		assertNotNull(result);
		assertEquals("-0.5000000000", result.toString());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(-0.5f, result.floatValue(), 1.0f);
		assertEquals(-0.5, result.doubleValue(), 1.0);
		assertEquals(-1, result.signum());
		assertEquals(10, result.scale());
		assertEquals(10, result.precision());
		assertEquals("-0.5000000000", result.toEngineeringString());
		assertEquals("-0.5000000000", result.toPlainString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
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
		new org.junit.runner.JUnitCore().run(MathUtilTest.class);
	}
}