package com.genetic.program.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import junit.framework.*;

/**
 * The class <code>HomeControllerTest</code> contains tests for the class <code>{@link HomeController}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:56 PM, using the Spring generator
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class HomeControllerTest extends TestCase {
	/**
	 * Run the void home(Model,HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	public void testHome_1()
		throws Exception {
		HomeController fixture = HomeControllerFactory.createHomeController();
		ExtendedModelMap model = new ExtendedModelMap();
		MockHttpServletRequest request = new MockHttpServletRequest();
		MockHttpServletResponse response = new MockHttpServletResponse();

		fixture.home(model, request, response);

		// add additional test code here
	}

	/**
	 * Run the void home(Model,HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	public void testHome_2()
		throws Exception {
		HomeController fixture = HomeControllerFactory.createHomeController();
		ExtendedModelMap model = new ExtendedModelMap();
		MockHttpServletRequest request = new MockHttpServletRequest();
		MockHttpServletResponse response = new MockHttpServletResponse();

		fixture.home(model, request, response);

		// add additional test code here
	}

	/**
	 * Run the void home(Model,HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	public void testHome_3()
		throws Exception {
		HomeController fixture = HomeControllerFactory.createHomeController();
		ExtendedModelMap model = new ExtendedModelMap();
		MockHttpServletRequest request = new MockHttpServletRequest();
		MockHttpServletResponse response = new MockHttpServletResponse();

		fixture.home(model, request, response);

		// add additional test code here
		assertEquals(0, model.size());
		assertEquals(200, response.getStatus());
	}

	/**
	 * Run the void home(Model,HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	public void testHome_4()
		throws Exception {
		HomeController fixture = HomeControllerFactory.createHomeController();
		ExtendedModelMap model = new ExtendedModelMap();
		MockHttpServletRequest request = new MockHttpServletRequest();
		MockHttpServletResponse response = new MockHttpServletResponse();

		fixture.home(model, request, response);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @see TestCase#setUp()
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	protected void setUp()
		throws Exception {
		super.setUp();
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @see TestCase#tearDown()
	 *
	 * @generatedBy CodePro at 7/12/13 4:56 PM
	 */
	protected void tearDown()
		throws Exception {
		super.tearDown();
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
		if (args.length == 0) {
			// Run all of the tests
			junit.textui.TestRunner.run(HomeControllerTest.class);
		} else {
			// Run only the named tests
			TestSuite suite = new TestSuite("Selected tests");
			for (int i = 0; i < args.length; i++) {
				TestCase test = new HomeControllerTest();
				test.setName(args[i]);
				suite.addTest(test);
			}
			junit.textui.TestRunner.run(suite);
		}
	}
}