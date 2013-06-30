package com.genetic.program.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.genetic.program.controller.HomeController;
import com.genetic.program.math.MathUtil;
import com.genetic.program.model.generation.Gene;
import com.genetic.program.model.generation.Generation;
import com.genetic.program.tree.BinaryMathTree;
import com.genetic.program.tree.BinaryMathTreeParser;
import com.genetic.program.tree.ConstantNode;
import com.genetic.program.tree.Operand;
import com.genetic.program.tree.Operator;
import com.genetic.program.tree.TreeNode;
import com.genetic.program.tree.VariableNode;
import com.rits.cloning.Cloner;

public class GenerationToGeneration {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private static final int NUMBER_OF_MUTATIONS = 5;
	private static final int NUMBER_OF_CROSSOVERS = 2;
	
	private Cloner _cloner;
	
	public GenerationToGeneration(Cloner cloner){
		this._cloner = cloner;
	}
	
	public Generation populate(Generation oldGeneration, String[] validOperators, int minInt, int maxInt) {
		Generation newGeneration = new Generation();
		
		int currentPlace = 0;
		int oldGerationSize = oldGeneration.getGenes().size();
		
		for(Gene gene : oldGeneration.getGenes()){
			for(int i = 0; i < NUMBER_OF_MUTATIONS; i++){
				newGeneration.getGenes().add(mutateGene(_cloner.deepClone(gene), validOperators, minInt, maxInt));
			}
			
			for(int i = 0; i < NUMBER_OF_CROSSOVERS; i++){
				int crossOverWith = currentPlace;
				
				while(crossOverWith == currentPlace){
					crossOverWith = MathUtil.randomNumber(0, oldGerationSize - 1);
				}
				
				newGeneration.getGenes().addAll(crossOverGenes(_cloner.deepClone(gene), _cloner.deepClone(oldGeneration.getGenes().get(crossOverWith))));
			}
			
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
		
		//we will update the genes later so we can just add them now
		genes.add(gene1);
		genes.add(gene2);
		
		TreeNode treeNode1 = getCrossOverTreeNode(gene1.getBinaryMathTree());
		TreeNode treeNode2 = getCrossOverTreeNode(gene2.getBinaryMathTree());
		
		Operator parent1 = (Operator)treeNode1.getParent();
		Operator parent2 = (Operator)treeNode2.getParent();
		
		replaceParentChild(parent1, treeNode1, treeNode2);
		replaceParentChild(parent2, treeNode2, treeNode1);
		
		return genes;
	}
	
	
	private static final double LOWEST_PECENT_CROSSOVER = .5;
	private TreeNode getCrossOverTreeNode(BinaryMathTree binaryMathTree){
		List<TreeNode> treeNodes = binaryMathTree.levelorder();
		int treeSizeMinus1 = treeNodes.size() - 1;
		
		int returnIndex = MathUtil.randomNumber((int)(treeSizeMinus1 * LOWEST_PECENT_CROSSOVER), treeSizeMinus1);
		
		return treeNodes.get(returnIndex);
	}

	private Gene mutateGene(Gene gene, String[] validOperators, int minInt, int maxInt) {
		
		BinaryMathTree binaryMathTree =  gene.getBinaryMathTree();
		
		List<TreeNode> levelOrder = binaryMathTree.levelorder();
		
		int makeChangeTo = MathUtil.randomNumber(0 , levelOrder.size()-1);
		
		TreeNode nodeToChange = levelOrder.get(makeChangeTo);
				
		if(nodeToChange instanceof Operand){
			Operand currentOperand = (Operand) nodeToChange;
			Operand newOperand  = randomConstantsAndVariablesGenerator(minInt, maxInt);
			
			Operator parentOperator = (Operator)currentOperand.getParent();
			
			replaceParentChild(parentOperator, currentOperand, newOperand);
		}
		else{
			Operator currentOperator = (Operator) nodeToChange;
			
			HashSet<String> hashSet = new HashSet<String>();
			
			hashSet.addAll(Arrays.asList(validOperators));
			hashSet.remove(currentOperator.operatorStringEquivalant());
			
			String newOperatorString = SeedGeneration.randomOperator(hashSet.toArray(new String[hashSet.size()]));
			
			
			Operator newOperator = BinaryMathTreeParser.operatorStringToTreeNode(newOperatorString);
			
			newOperator.setTreeNodes(currentOperator.getLeftNode(), currentOperator.getRightNode());
			
			Operator parentOperator = (Operator)currentOperator.getParent();
			
			if(parentOperator != null){
				replaceParentChild(parentOperator, currentOperator, newOperator);
			}
			else{
				binaryMathTree.setRootNode(newOperator);
			}
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
	
	private void replaceParentChild(Operator parentOperator, TreeNode currentTreeNode, TreeNode newTreeNode){
		if(parentOperator.getLeftNode().equals(currentTreeNode)){
			parentOperator.setTreeNodes(newTreeNode, parentOperator.getRightNode());
		}
		else if(parentOperator.getRightNode().equals(currentTreeNode)){
			parentOperator.setTreeNodes(newTreeNode, parentOperator.getLeftNode());
		}
	}
}
