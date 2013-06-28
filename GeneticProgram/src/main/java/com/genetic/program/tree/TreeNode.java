package com.genetic.program.tree;

import java.util.HashMap;

public interface TreeNode {
	/** Node id for variable nodes */
	public static final int VARIABLE_NODE = 1;
	/** Node id for constant nodes */
	public static final int CONSTANT_NODE = 2;
	/** Node id for addition nodes */
	public static final int ADDITION_NODE = 3;
	/** Node id for subtraction nodes */
	public static final int SUBTRACTION_NODE = 4;
	/** Node id for multiplication nodes */
	public static final int MULTIPLICATION_NODE = 5;
	/** Node id for division nodes */
	public static final int DIVISION_NODE = 6;

	public int nodeType();
	
	public double getValue(HashMap<String, Double> variables);
}
