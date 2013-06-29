package com.genetic.program.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.genetic.program.math.MathUtil;
import com.genetic.program.model.generation.Generation;
import com.genetic.program.model.generation.Settings;
import com.genetic.program.tree.BinaryMathTree;
import com.genetic.program.tree.BinaryMathTreeException;
import com.genetic.program.tree.BinaryMathTreeParser;
import com.genetic.program.util.SeedGeneration;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		Settings settings = new Settings();
		
		settings.setEnvironmentVariables(
			MathUtil.calculateEnvironmentVariables(
				MathUtil.xVertex(settings.getQuadraticA(), settings.getQuadraticB()), 
				settings.getEnviromentSize()
			)
		);
		
		try {
			BinaryMathTree binaryMathTree = BinaryMathTreeParser.stringEquationToBinaryMathTree(settings.getTargetFunction());
			settings.setEnviromentFitnessTargets(MathUtil.generateEnviromnentTargets(settings.getEnvironmentVariables(), binaryMathTree));
			
			Generation seedGeneration = SeedGeneration.getSeeds(settings.getSeedGenerationSettings(), settings.getValidOperators());
			
		} catch (BinaryMathTreeException e) {
			e.printStackTrace();
		}
		
		return "home";
	}
}