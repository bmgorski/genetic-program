package com.genetic.program.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import com.genetic.program.math.MathUtil;
import com.genetic.program.model.generation.Gene;
import com.genetic.program.model.generation.Generation;
import com.genetic.program.tree.BinaryMathTreeParser;
import com.genetic.program.tree.ConstantNode;
import com.genetic.program.tree.Operand;
import com.genetic.program.tree.Operator;
import com.genetic.program.tree.TreeNode;
import com.genetic.program.tree.VariableNode;
import com.rits.cloning.Cloner;

public class GenerationToGeneration {
	private static final int NUMBER_OF_MUTATIONS = 2;
	private static final int NUMBER_OF_CROSSOVERS = 2;
	
	private Cloner _cloner;
	
	public GenerationToGeneration(Cloner cloner){
		this._cloner = cloner;
	}
	
	public Generation populate(Generation oldGeneration, String[] validOperators, int minInt, int maxInt) {
		Generation newGeneration = new Generation();
		
		int oldGerationSize = oldGeneration.getGenes().size();
		int currentPlace = 0;
		for(Gene gene : oldGeneration.getGenes()){
			for(int i = 0; i < NUMBER_OF_MUTATIONS; i++){
				newGeneration.getGenes().add(mutateGene(_cloner.deepClone(gene), validOperators, minInt, maxInt));
			}
			
//			for(int i = 0; i < NUMBER_OF_CROSSOVERS; i++){
//				int crossOverWith = currentPlace;
//				
//				while(crossOverWith == currentPlace){
//					crossOverWith = MathUtil.randomNumber(0, oldGerationSize - 1);
//				}
//				
//				newGeneration.getGenes().addAll(crossOverGenes(_cloner.deepClone(gene), _cloner.deepClone(oldGeneration.getGenes().get(crossOverWith))));
//			}
			
			currentPlace++;
		}
		
		
		return newGeneration;
	}

	/**
	 * 
	 * @param gene1
	 * @param gene2
	 * @returns {@link List} of gene1 and gene2 after a crossover
	 * 
	 */
	private List<Gene> crossOverGenes(Gene gene1, Gene gene2) {
		List<Gene> genes = new ArrayList<Gene>();
		
		
		
		return genes;
	}

	private Gene mutateGene(Gene gene, String[] validOperators, int minInt, int maxInt) {
		
		List<TreeNode> levelOrder = gene.getGenes().levelorder();
		
		//makes sure the mutation is only in the lower portion of the tree so the result is not to different
		int makeChangeTo = MathUtil.randomNumber((int)(levelOrder.size() * .5) , levelOrder.size()-1);
		
		TreeNode nodeToChange = levelOrder.get(makeChangeTo);
		
		if(nodeToChange instanceof Operand){
			nodeToChange = null;
			nodeToChange = randomConstantsAndVariablesGenerator(minInt, maxInt);
		}
		else{
			Operator currentOperator = (Operator) nodeToChange;
			
			HashSet<String> hashSet = new HashSet<String>();
			
			hashSet.addAll(Arrays.asList(validOperators));
			hashSet.remove(currentOperator.operatorStringEquivalant());
			
			String newOperatorString = SeedGeneration.randomOperator(hashSet.toArray(new String[hashSet.size()]));
			Operator newOperator = BinaryMathTreeParser.operatorStringToTreeNode(newOperatorString);
			
			newOperator.setTreeNodes(currentOperator.getLeftNode(), currentOperator.getRightNode());
			
			currentOperator = null;
			currentOperator = newOperator;
		}
		
		return gene;
	}
	
	private static Operand randomConstantsAndVariablesGenerator(int minInt, int maxInt) {
		Operand operand = null;
		
		int pecent = MathUtil.randomNumber(1, 100);
		if(pecent > 65){
			operand = new VariableNode();
			VariableNode variableNode = (VariableNode)operand;
			variableNode.setVariableName("x");
		}
		else{
			operand = new ConstantNode();
			operand.setLeafValue(MathUtil.stringToDouble(MathUtil.randomNumber(minInt, maxInt).toString()));
		}
		
		return operand;
	}
}
