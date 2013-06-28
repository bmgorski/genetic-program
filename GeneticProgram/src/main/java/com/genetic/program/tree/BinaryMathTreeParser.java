package com.genetic.program.tree;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.genetic.program.math.MathUtil;

public class BinaryMathTreeParser {
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
		TreeNode rootNode = null;

		// We do not support upper case variables
		equation = equation.toLowerCase();

		String strings[] = equation.split("");

		Stack<String> parentheses = new Stack<String>();

		for (int i = 0; i < strings.length; i++) {
			String thisString = strings[i];

			/*
			 * Dealing with parentheses
			 */
			if (thisString.equals("(")) {
				parentheses.push(thisString);
			} else if (thisString.equals(")")) {
				if (parentheses.size() > 0) {
					parentheses.pop();
				} else {
					throw new BinaryMathTreeException(
							"Missmatached parentheses");
				}
			}
			
			/*
			 * Dealing with numbers
			 */
			else if(isNumber(thisString)){
				StringBuilder stringBuilder = new StringBuilder(); 
				
				stringBuilder.append(thisString);
				
				while(i + 1 < strings.length && isNumber(strings[i + 1])){
					stringBuilder.append(strings[i + 1]);
					i++;
				}
				
				ConstantNode constantNode = new ConstantNode();
				constantNode.setLeafValue(MathUtil.stringToDouble(stringBuilder.toString()));
			}
			else if(isVariable(thisString)){				
				VariableNode variableNode = new VariableNode();
				variableNode.setVariableName(thisString);
			}
			else if(isAddition(thisString)){				
				AdditionNode variableNode = new AdditionNode();
			}
			else if(isSubtration(thisString)){				
				SubtractionNode subtractionNode = new SubtractionNode();
			}
			else if(isMultiplication(thisString)){				
				MultiplicationNode multiplicationNode = new MultiplicationNode();
			}
			else if(isDivision(thisString)){				
				DivisionNode divisionNode = new DivisionNode();
			}
			else{
				throw new BinaryMathTreeException("Unknow character");
			}
		}

		if (parentheses.size() > 0) {
			throw new BinaryMathTreeException("Missmatached parentheses");
		}

		return binaryMathTree;
	}

	private static boolean isNumber(String lengthOneString) {
		Pattern p = Pattern.compile(lengthOneString);
		Matcher m = p.matcher("\\d");
		return m.matches();
	}
	
	private static boolean isVariable(String lengthOneString) {
		Pattern p = Pattern.compile(lengthOneString);
		Matcher m = p.matcher("[a-z]");
		return m.matches();
	}
	
	private static boolean isMultiplication(String lengthOneString) {
		return lengthOneString.equals("*");
	}
	private static boolean isDivision(String lengthOneString) {
		return lengthOneString.equals("/");
	}
	private static boolean isAddition(String lengthOneString) {
		return lengthOneString.equals("+");
	}
	private static boolean isSubtration(String lengthOneString) {
		return lengthOneString.equals("/");
	}
}
