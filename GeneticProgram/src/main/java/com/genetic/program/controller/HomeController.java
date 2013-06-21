package com.genetic.program.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.co.cogitolearning.cogpar.ExpressionNode;
import uk.co.cogitolearning.cogpar.Parser;

import com.genetic.program.math.MathUtil;
import com.genetic.program.model.generation.Settings;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

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
		
		Parser parser = new Parser();
		
		ExpressionNode expr = parser.parse(settings.getTargetFunction());
		
		settings.setEnviromentFitnessTargets(MathUtil.generateEnviromnentTargets(settings.getEnvironmentVariables(), expr));
		
		return "home";
	}
}