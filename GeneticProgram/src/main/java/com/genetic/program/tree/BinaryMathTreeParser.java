package com.genetic.program.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.genetic.program.controller.HomeController;
import com.genetic.program.math.MathUtil;

public class BinaryMathTreeParser  {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Takes a well formated equation and parses it to a binary math tree
	 * 
	 * Only supports lower case variables and one letter length variables
	 * 
	 * @param equation
	 * @return {@link BinaryMathTree} parsed from the equation
	 * 
	 */
	public static BinaryMathTree stringEquationToBinaryMathTree(String equation)
			throws BinaryMathTreeException {
		BinaryMathTree binaryMathTree = new BinaryMathTree();
		

		// We do not support upper case variables
		equation = equation.toLowerCase();
		
		// Spaces are not needed		
		logger.trace("equation: " + equation);

		String[] input = checkForValidityAndReturnInputAndSetVariableNames(equation, binaryMathTree);
		
		String[] output = ReversePolishNotation.infixToRPN(input);
		
	
		if(logger.isDebugEnabled()){
			StringBuilder stringBuilder = new StringBuilder();
			for (String token : output) {
				stringBuilder.append(token + " ");
			}
			
			logger.trace("output: " + stringBuilder.toString());
		}
		
		TreeNode rootNode = reversPolishNotationToBinaryMathTree(output);
		binaryMathTree.setRootNode(rootNode);

		return binaryMathTree;
	}
	
	private static TreeNode reversPolishNotationToBinaryMathTree(String[] outputs){		
		Stack<Object> objects = new Stack<Object>();
		
		for(String output : outputs){
			logger.trace("Object Legth: " + objects.size() + "Current String: " + output);
			
			if(ReversePolishNotation.OPERATORS.containsKey(output)){
				TreeNode treeNodeRight = (TreeNode)objects.pop();
				
				//It is valid for a node to only have one child is some cases
				logger.trace("TreeNode isEmpty: " + objects.isEmpty());
				
				TreeNode treeNodeLeft = null;
				if(!objects.isEmpty()){
					treeNodeLeft = (TreeNode)objects.pop();
				}
				
				
				Operator operator = operatorStringToTreeNode(output);

				operator.setTreeNodes(treeNodeLeft, treeNodeRight);
				objects.push(operator);
				
			}
			else if(isVariable(output)){
				VariableNode variableNode = new VariableNode();
				variableNode.setVariableName(output);
				objects.push(variableNode);
			}
			//we know it is a number aka a constant
			else{
				ConstantNode constantNode = new ConstantNode();
				constantNode.setLeafValue(MathUtil.stringToBigDecimalWithScale(output));
				objects.push(constantNode);
			}
			
			logger.trace("Object Legth: " + objects.size() + "Current String: " + output);
		}
		
		
		return (TreeNode)objects.pop();
	}
	
	private static String[] checkForValidityAndReturnInputAndSetVariableNames(String equation, BinaryMathTree binaryMathTree) throws BinaryMathTreeException{
		String[] strings = equation.split("");
		Stack<String> parentheses = new Stack<String>();
		List<String> input = new ArrayList<String>();
		logger.trace("strings length : " + strings.length);
		
		//Test for validity and parse into an input for the ReversePolishNotation parser
		for (int i = 0; i < strings.length; i++) {
			String thisString = strings[i];
			
			logger.trace("thisString: '" + thisString + "'");
			//remove spaces and empty
			if(thisString.equals(" ") || thisString.isEmpty()){
				continue;
			}			
			
			/*
			 * Dealing with parentheses
			 */
			if (thisString.equals("(")) {
				parentheses.push(thisString);
				input.add(thisString);
				
			} else if (thisString.equals(")")) {
				if (parentheses.size() > 0) {
					parentheses.pop();
					input.add(thisString);
				} else {
					throw new BinaryMathTreeException(
							"Missmatached parentheses");
				}
			}
			
			/*
			 * Dealing with numbers
			 */
			else if(isNumber(thisString)){
				StringBuilder sb = new StringBuilder(); 
				
				sb.append(thisString);
				
				while(i + 1 < strings.length && isNumber(strings[i + 1])){
					sb.append(strings[i + 1]);
					i++;
				}
				
				input.add(sb.toString());
			}
			else if(isVariable(thisString)){
				binaryMathTree.getVariableNames().add(thisString);
				input.add(thisString);
			}
			else if(ReversePolishNotation.OPERATORS.containsKey(thisString)){				
				input.add(thisString);
			}
			else{
				throw new BinaryMathTreeException("Unknow character");
			}
		}

		if (parentheses.size() > 0) {
			throw new BinaryMathTreeException("Missmatached parentheses");
		}
		
		return input.toArray(new String[input.size()]);
	}

	private static boolean isNumber(String lengthOneString) {
		return Character.isDigit(lengthOneString.charAt(0));
	}
	
	private static boolean isVariable(String lengthOneString) {
		return Character.isLowerCase(lengthOneString.charAt(0));
	}
	
	private static boolean isMultiplication(String newOperatorString) {
		return newOperatorString.equals("*");
	}
	private static boolean isDivision(String newOperatorString) {
		return newOperatorString.equals("/");
	}
	private static boolean isAddition(String newOperatorString) {
		return newOperatorString.equals("+");
	}
	private static boolean isSubtration(String newOperatorString) {
		return newOperatorString.equals("-");
	}
	
	public static Operator operatorStringToTreeNode(String newOperatorString) {
		Operator operator = null;
		if(isAddition(newOperatorString)){
			operator = new AdditionNode();
		}
		else if(isDivision(newOperatorString)){
			operator = new DivisionNode();
		}
		else if(isMultiplication(newOperatorString)){
			operator = new MultiplicationNode();			
		}
		else if(isSubtration(newOperatorString)){
			operator = new SubtractionNode();
		}
		
		return operator;
	}
}
