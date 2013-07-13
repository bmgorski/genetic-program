package com.genetic.program.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	private static final Logger logger = LoggerFactory.getLogger(GenerationToGeneration.class);
	
	private static final int NUMBER_OF_MUTATIONS = 5;
	private static final int NUMBER_OF_CROSSOVERS = 1;
	
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
				Gene gene1 = gene;
				Gene gene2 = oldGeneration.getGenes().get(crossOverWith);
				
				logger.trace("gene1 Size: " + gene1.getBinaryMathTree().size());
				logger.trace("gene2 Size: " + gene2.getBinaryMathTree().size());
				
				logger.trace("gene1 level order size: " + gene1.getBinaryMathTree().levelorder().size());
				logger.trace("gene2 level order size: " + gene2.getBinaryMathTree().levelorder().size());
				
				newGeneration.getGenes().addAll(crossOverGenes(_cloner.deepClone(gene1), _cloner.deepClone(gene1)));
			}
			
			currentPlace++;
		}
		
		
		return newGeneration;
	}

	/**
	 * 
	 * @param gene1
	 * @param gene2
	 * @param maxFunctionSize 
	 * @returns {@link List} of gene1 and gene2 after a crossover
	 * 
	 */
	private List<Gene> crossOverGenes(Gene gene1, Gene gene2) {
		List<Gene> genes = new ArrayList<Gene>();
		
		//we will update the genes later so we can just add them now
		genes.add(gene1);
		genes.add(gene2);
		
		TreeNode treeNode1 = getCrossOverTreeNode(gene1.getBinaryMathTree(), false, 5);
		TreeNode treeNode2 = getCrossOverTreeNode(gene2.getBinaryMathTree(), true, treeNode1.getNumberOfChildren());
		
		Operator parent1 = (Operator)treeNode1.getParent();
		Operator parent2 = (Operator)treeNode2.getParent();
		
		replaceParentChild(parent1, treeNode1, treeNode2);
		replaceParentChild(parent2, treeNode2, treeNode1);
		
		return genes;
	}
	
	
	private TreeNode getCrossOverTreeNode(BinaryMathTree binaryMathTree, boolean sameSize, int targetSize){
		TreeNode treeNode = null;
		List<TreeNode> treeNodes = binaryMathTree.levelorder();
		int treeSize = treeNodes.size() - 1;
				
		int returnIndex = 0;
		
		if(sameSize){
			returnIndex = treeSize - targetSize;
		}
		else{
			returnIndex = treeSize - MathUtil.randomNumber(1, targetSize);
		}
		
		if(returnIndex < 0){
			logger.debug(returnIndex + "");
			returnIndex = 2;
		}
		
		if(returnIndex > treeSize){
			logger.debug(returnIndex + "");
			returnIndex = treeSize;
		}
		
		try {
			treeNode = treeNodes.get(returnIndex);
		} catch (Exception e) {
			e.printStackTrace();
			logger.debug("treeSize: " + treeSize);
			logger.debug("returnIndex: " + returnIndex);
			logger.debug(treeNodes.size() + "");
		}

		
		
		
		return treeNode;
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
			operand.setLeafValue(MathUtil.stringToBigDecimalWithScale(MathUtil.randomNumber(minInt, maxInt).toString()));
		}
		
		return operand;
	}
	
	private void replaceParentChild(Operator parentOperator, TreeNode currentTreeNode, TreeNode newTreeNode){
		if(parentOperator == null){
			TreeNode node = parentOperator;
			node = newTreeNode;
		}
		else{
			if(parentOperator.getLeftNode() != null && parentOperator.getLeftNode().equals(currentTreeNode)){
				parentOperator.setTreeNodes(newTreeNode, parentOperator.getRightNode());
			}
			else if(parentOperator.getRightNode() != null && parentOperator.getRightNode().equals(currentTreeNode)){
				parentOperator.setTreeNodes(newTreeNode, parentOperator.getLeftNode());
			}
		}
	}
}
