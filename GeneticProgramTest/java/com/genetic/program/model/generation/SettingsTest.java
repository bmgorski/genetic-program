package com.genetic.program.model.generation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SettingsTest</code> contains tests for the class <code>{@link Settings}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:56 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class SettingsTest {
	/**
	 * Run the Settings() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSettings_1()
		throws Exception {

		Settings result = new Settings();

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Integer(200), result.getEnviromentSize());
		assertEquals(null, result.getEnvironmentVariables());
		assertEquals("(3*x*x+4)/5", result.getTargetFunction());
		assertEquals(null, result.getEnviromentFitnessTargets());
	}

	/**
	 * Run the List<BigDecimal> getEnviromentFitnessTargets() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetEnviromentFitnessTargets_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();

		List<BigDecimal> result = fixture.getEnviromentFitnessTargets();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Integer getEnviromentSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetEnviromentSize_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();

		Integer result = fixture.getEnviromentSize();

		// add additional test code here
		assertNotNull(result);
		assertEquals("200", result.toString());
		assertEquals((byte) -56, result.byteValue());
		assertEquals((short) 200, result.shortValue());
		assertEquals(200, result.intValue());
		assertEquals(200L, result.longValue());
		assertEquals(200.0f, result.floatValue(), 1.0f);
		assertEquals(200.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the List<BigDecimal> getEnvironmentVariables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetEnvironmentVariables_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();

		List<BigDecimal> result = fixture.getEnvironmentVariables();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the BigDecimal getMaxFitnessValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetMaxFitnessValue_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();

		BigDecimal result = fixture.getMaxFitnessValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals("10000000000", result.toString());
		assertEquals(1410065408, result.intValue());
		assertEquals(10000000000L, result.longValue());
		assertEquals(1.0E10f, result.floatValue(), 1.0f);
		assertEquals(1.0E10, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals(0, result.scale());
		assertEquals(11, result.precision());
		assertEquals(10000000000L, result.longValueExact());
		assertEquals("10000000000", result.toEngineeringString());
		assertEquals("10000000000", result.toPlainString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) -7168, result.shortValue());
	}

	/**
	 * Run the BigDecimal getQuadraticA() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetQuadraticA_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();

		BigDecimal result = fixture.getQuadraticA();

		// add additional test code here
		assertNotNull(result);
		assertEquals("2", result.toString());
		assertEquals(2, result.intValue());
		assertEquals(2L, result.longValue());
		assertEquals(2.0f, result.floatValue(), 1.0f);
		assertEquals(2.0, result.doubleValue(), 1.0);
		assertEquals(1, result.signum());
		assertEquals(0, result.scale());
		assertEquals(1, result.precision());
		assertEquals((byte) 2, result.byteValueExact());
		assertEquals(2, result.intValueExact());
		assertEquals(2L, result.longValueExact());
		assertEquals((short) 2, result.shortValueExact());
		assertEquals("2", result.toEngineeringString());
		assertEquals("2", result.toPlainString());
		assertEquals((byte) 2, result.byteValue());
		assertEquals((short) 2, result.shortValue());
	}

	/**
	 * Run the BigDecimal getQuadraticB() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetQuadraticB_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();

		BigDecimal result = fixture.getQuadraticB();

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
	 * Run the SeedGenerationSettings getSeedGenerationSettings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetSeedGenerationSettings_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();

		SeedGenerationSettings result = fixture.getSeedGenerationSettings();

		// add additional test code here
		assertNotNull(result);
		assertEquals(10000, result.getNumberOfSeeds());
		assertEquals(4, result.getMinNumberOfOperators());
		assertEquals(8, result.getMaxNumberOfOperators());
		assertEquals(0, result.getMinNumberOfParentheses());
		assertEquals(1, result.getMaxNumberOfParentheses());
		assertEquals(1, result.getMinInt());
		assertEquals(9, result.getMaxInt());
	}

	/**
	 * Run the String getTargetFunction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetTargetFunction_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();

		String result = fixture.getTargetFunction();

		// add additional test code here
		assertEquals("(3*x*x+4)/5", result);
	}

	/**
	 * Run the String[] getValidOperators() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testGetValidOperators_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();

		String[] result = fixture.getValidOperators();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertEquals("*", result[0]);
		assertEquals("/", result[1]);
		assertEquals("+", result[2]);
		assertEquals("-", result[3]);
	}

	/**
	 * Run the void setEnviromentFitnessTargets(List<BigDecimal>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetEnviromentFitnessTargets_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();
		List<BigDecimal> enviromentFitnessTargets = new ArrayList<BigDecimal>();

		fixture.setEnviromentFitnessTargets(enviromentFitnessTargets);

		// add additional test code here
	}

	/**
	 * Run the void setEnviromentSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetEnviromentSize_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();
		Integer enviromentSize = new Integer(1);

		fixture.setEnviromentSize(enviromentSize);

		// add additional test code here
	}

	/**
	 * Run the void setEnvironmentVariables(List<BigDecimal>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetEnvironmentVariables_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();
		List<BigDecimal> environmentVariables = new ArrayList<BigDecimal>();

		fixture.setEnvironmentVariables(environmentVariables);

		// add additional test code here
	}

	/**
	 * Run the void setMaxFitnessValue(BigDecimal) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetMaxFitnessValue_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();
		BigDecimal maxFitnessValue = new BigDecimal(1.0);

		fixture.setMaxFitnessValue(maxFitnessValue);

		// add additional test code here
	}

	/**
	 * Run the void setQuadraticA(BigDecimal) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetQuadraticA_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();
		BigDecimal quadraticA = new BigDecimal(1.0);

		fixture.setQuadraticA(quadraticA);

		// add additional test code here
	}

	/**
	 * Run the void setQuadraticB(BigDecimal) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetQuadraticB_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();
		BigDecimal quadraticB = new BigDecimal(1.0);

		fixture.setQuadraticB(quadraticB);

		// add additional test code here
	}

	/**
	 * Run the void setSeedGenerationSettings(SeedGenerationSettings) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetSeedGenerationSettings_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();
		SeedGenerationSettings seedGenerationSettings = SeedGenerationSettingsFactory.createSeedGenerationSettings();

		fixture.setSeedGenerationSettings(seedGenerationSettings);

		// add additional test code here
	}

	/**
	 * Run the void setTargetFunction(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetTargetFunction_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();
		String targetFunction = "";

		fixture.setTargetFunction(targetFunction);

		// add additional test code here
	}

	/**
	 * Run the void setValidOperators(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	@Test
	public void testSetValidOperators_1()
		throws Exception {
		Settings fixture = SettingsFactory.createSettings();
		String[] validOperators = new String[] {};

		fixture.setValidOperators(validOperators);

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
		new org.junit.runner.JUnitCore().run(SettingsTest.class);
	}
}