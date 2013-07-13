package com.genetic.program.controller;

import com.genetic.program.util.GenerationToGeneration;
import com.rits.cloning.Cloner;


/**
 * The class <code>HomeControllerFactory</code> implements static methods that return instances of the class <code>{@link HomeController}</code>.
 *
 * @generatedBy CodePro at 7/12/13 4:55 PM
 * @author bmgorski
 * @version $Revision: 1.0 $
 */
public class HomeControllerFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	private HomeControllerFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link HomeController}</code>.
	 *
	 * @generatedBy CodePro at 7/12/13 4:55 PM
	 */
	public static HomeController createHomeController() {
		return new HomeController(new GenerationToGeneration(new Cloner()));
	}
}