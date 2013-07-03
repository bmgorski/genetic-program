package com.genetic.program.controller;

import java.math.BigDecimal;
import java.util.Date;

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
import com.genetic.program.util.GenerationToGeneration;
import com.genetic.program.util.CalculateFitness;
import com.genetic.program.util.SeedGeneration;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private GenerationToGeneration _generationToGeneration;
	
	public HomeController(GenerationToGeneration generationToGeneration) {
		this._generationToGeneration = generationToGeneration;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		Settings settings = new Settings();
		Date startTime;
		Date endTime;

		startTime = new Date();
		logger.debug("Setting EnvironmentVariables Time: " + startTime.getTime());
		settings.setEnvironmentVariables(
			MathUtil.calculateEnvironmentVariables(
				MathUtil.xVertex(settings.getQuadraticA(), settings.getQuadraticB()), 
				settings.getEnviromentSize()
			)
		);
		
		endTime = new Date();
		logger.debug("End Setting EnvironmentVariables Time: " + endTime.getTime());
		logger.debug("Setting EnvironmentVariables took: " + (endTime.getTime() - startTime.getTime()) + " milliseconds");
		
		try {
			startTime = new Date();
			logger.debug("Generating target binary math tree: " + startTime.getTime());
			
			BinaryMathTree binaryMathTree = BinaryMathTreeParser.stringEquationToBinaryMathTree(settings.getTargetFunction());
			
			endTime = new Date();
			logger.debug("End Generating target binary math tree: " + endTime.getTime());
			logger.debug("Generating target binary math tree took: " + (endTime.getTime() - startTime.getTime()) + " milliseconds");
			
			startTime = new Date();
			logger.debug("Generating Enviroment Fitness Targets: " + startTime.getTime());
			
			settings.setEnviromentFitnessTargets(MathUtil.generateBinaryMathTreeFitness(settings.getEnvironmentVariables(), binaryMathTree));
			
			endTime = new Date();
			logger.debug("End Generating Enviroment Fitness Targets: " + endTime.getTime());
			logger.debug("Generating Enviroment Fitness Targets took: " + (endTime.getTime() - startTime.getTime()) + " milliseconds");
			
			startTime = new Date();
			logger.debug("Generating Seed Generation: " + startTime.getTime());
			
			Generation seedGeneration = SeedGeneration.getSeeds(settings.getSeedGenerationSettings(), settings.getValidOperators());
			
			endTime = new Date();
			logger.debug("End Generating Seed Generation: " + endTime.getTime());
			logger.debug("Generating Seed Generation took: " + (endTime.getTime() - startTime.getTime()) + " milliseconds");
			
			startTime = new Date();
			logger.debug("Caluclate Scores And Prune: " + startTime.getTime());
			
			CalculateFitness.caluclateFitnessValuesAndPrune(seedGeneration, settings.getEnvironmentVariables(), settings.getEnviromentFitnessTargets(), settings.getMaxFitnessValue());
			
			endTime = new Date();
			logger.debug("Caluclate Scores And Prune: " + endTime.getTime());
			logger.debug("Caluclate Scores And Prune took: " + (endTime.getTime() - startTime.getTime()) + " milliseconds");
			

			int generationNumber = 0;
			Generation oldGeneration = seedGeneration;
			
			while((oldGeneration.getGenes().get(0).getFitnessValue().compareTo(MathUtil.stringToBigDecimalWithScale("0"))) != 0){
				logger.debug("Generation " + generationNumber + " " +
						"best fit was: " + oldGeneration.getGenes().get(0).getFitnessValue().toString() + " " +
						"and had " + oldGeneration.getGenes().size() + 
						" genes left in the gene pool" +
						" there size of the tree was: ");				
				
				Generation newGeneration = _generationToGeneration.populate(oldGeneration, settings.getValidOperators(), settings.getSeedGenerationSettings().getMinInt(), settings.getSeedGenerationSettings().getMaxInt());
				
				CalculateFitness.caluclateFitnessValuesAndPrune(newGeneration, settings.getEnvironmentVariables(), settings.getEnviromentFitnessTargets(), settings.getMaxFitnessValue());
				
				oldGeneration = null;
				oldGeneration = newGeneration;
				generationNumber++;
			}
			
			logger.debug("Generation " + generationNumber + " best fit was: " + oldGeneration.getGenes().get(0).getFitnessValue().toString() + " and had " + oldGeneration.getGenes().size() + " genes left in the gene pool");				

			
			logger.debug("Yeah we won!!!");

			
			
		} catch (BinaryMathTreeException e) {
			e.printStackTrace();
		}
		
		return "home";
	}
}