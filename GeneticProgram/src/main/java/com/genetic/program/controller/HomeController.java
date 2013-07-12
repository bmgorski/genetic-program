package com.genetic.program.controller;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	private static final String NEW_LINE = "\n";
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private GenerationToGeneration _generationToGeneration;
	
	public HomeController(GenerationToGeneration generationToGeneration) {
		this._generationToGeneration = generationToGeneration;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void home(Model model, HttpServletRequest request, HttpServletResponse response) {
		try{
			Settings settings = new Settings();
			Date startTime;
			Date endTime;
							
			startTime = new Date();
			
			PrintWriter writer = response.getWriter();
			
			
			writer.println("Setting EnvironmentVariables Time: " + startTime.getTime() + NEW_LINE);
			settings.setEnvironmentVariables(
				MathUtil.calculateEnvironmentVariables(
					MathUtil.xVertex(settings.getQuadraticA(), settings.getQuadraticB()), 
					settings.getEnviromentSize()
				)
			);
			
			endTime = new Date();
			writer.println("End Setting EnvironmentVariables Time: " + endTime.getTime()  + NEW_LINE);
			writer.println("Setting EnvironmentVariables took: " + (endTime.getTime() - startTime.getTime()) + " milliseconds" + NEW_LINE);
		
			startTime = new Date();
			writer.println("Generating target binary math tree: " + startTime.getTime() + NEW_LINE);
			
			BinaryMathTree binaryMathTree = BinaryMathTreeParser.stringEquationToBinaryMathTree(settings.getTargetFunction());
			
			endTime = new Date();
			writer.println("End Generating target binary math tree: " + endTime.getTime() + NEW_LINE);
			writer.println("Generating target binary math tree took: " + (endTime.getTime() - startTime.getTime()) + " milliseconds" + NEW_LINE);
			
			startTime = new Date();
			writer.println("Generating Enviroment Fitness Targets: " + startTime.getTime() + NEW_LINE);
			
			settings.setEnviromentFitnessTargets(MathUtil.generateBinaryMathTreeFitness(settings.getEnvironmentVariables(), binaryMathTree));
			
			endTime = new Date();
			writer.println("End Generating Enviroment Fitness Targets: " + endTime.getTime() + NEW_LINE);
			writer.println("Generating Enviroment Fitness Targets took: " + (endTime.getTime() - startTime.getTime()) + " milliseconds" + NEW_LINE);
			
			startTime = new Date();
			writer.println("Generating Seed Generation: " + startTime.getTime() + NEW_LINE);
			
			Generation oldGeneration  = SeedGeneration.getSeeds(settings.getSeedGenerationSettings(), settings.getValidOperators());
			
			endTime = new Date();
			writer.println("End Generating Seed Generation: " + endTime.getTime() + NEW_LINE);
			writer.println("Generating Seed Generation took: " + (endTime.getTime() - startTime.getTime()) + " milliseconds" + NEW_LINE);
			
			startTime = new Date();
			writer.println("Caluclate Scores And Prune: " + startTime.getTime() + NEW_LINE);
			
			CalculateFitness.caluclateFitnessValuesAndPrune(oldGeneration, settings.getEnvironmentVariables(), settings.getEnviromentFitnessTargets(), settings.getMaxFitnessValue());
			
			endTime = new Date();
			writer.println("Caluclate Scores And Prune: " + endTime.getTime() + NEW_LINE);
			writer.println("Caluclate Scores And Prune took: " + (endTime.getTime() - startTime.getTime()) + " milliseconds" + NEW_LINE);
			

			int generationNumber = 0;
			int maxTreeSizeLength = oldGeneration.getGenerationMaxSize();
			
			writer.flush();
			while((oldGeneration.getGenes().get(0).getFitnessValue().compareTo(MathUtil.stringToBigDecimalWithScale("0"))) != 0){
				logger.debug("here");
				writer.println("Generation " + generationNumber + " " +
						"best fit was: " + oldGeneration.getGenes().get(0).getFitnessValue().toString() + " " +
						"and had " + oldGeneration.getGenes().size() + 
						" geration max size: " + oldGeneration.getGenerationMaxSize() + NEW_LINE);				
				
				Generation newGeneration = _generationToGeneration.populate(oldGeneration, settings.getValidOperators(), settings.getSeedGenerationSettings().getMinInt(), settings.getSeedGenerationSettings().getMaxInt(), maxTreeSizeLength);
				
				CalculateFitness.caluclateFitnessValuesAndPrune(newGeneration, settings.getEnvironmentVariables(), settings.getEnviromentFitnessTargets(), settings.getMaxFitnessValue());
				
				oldGeneration = null;
				oldGeneration = newGeneration;
				generationNumber++;
				
				writer.flush();
			}
			
			writer.println("Generation " + generationNumber + " best fit was: " + oldGeneration.getGenes().get(0).getFitnessValue().toString() + " and had " + oldGeneration.getGenes().size() + " genes left in the gene pool" + NEW_LINE);				

			
			writer.println("Yeah we won!!!");
			writer.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}