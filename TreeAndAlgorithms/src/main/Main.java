package main;

import it.binarytree.BinaryNode;
import it.binarytree.BinaryTree;
import it.binarytree.BinaryTreeIterativeAlgorithms;
import it.binarytree.BinaryTreeLL;

public class Main {

	
	public static void main(String[] args) {
		
		BinaryTreeLL binaryTree = initializeTreeLL();
		binaryTree.preOrder(binaryTree.root);
		System.out.println();
		binaryTree.inOrder(binaryTree.root);
		System.out.println();
		binaryTree.postOrder(binaryTree.root);
		System.out.println();
		binaryTree.levelOrder();
		System.out.println();
		binaryTree.search("N5");
		binaryTree.insert("N10");
		binaryTree.insert("N11");
		binaryTree.levelOrder();
		System.out.println();
		System.out.println(binaryTree.getDeepestNode().value);
		binaryTree.deleteDeepestNode();
		binaryTree.levelOrder();
		System.out.println();
		binaryTree.deleteNode("N5");
		binaryTree.levelOrder();
		System.out.println();
		//binaryTree.deleteBT();
	
		// from here operation with the binaryTree array;
		BinaryTree bt = initializeBinaryTree();
		System.out.println();
		bt.preOrder(1);
		System.out.println();
		bt.inOrder(1);
		System.out.println();
		bt.postOrder(1);
		System.out.println();
		bt.levelOrder();
		System.out.println();
		bt.search("N12");
		System.out.println();

		bt.delete("N12");
		System.out.println();

		bt.deleteBT();
		System.out.println();
		// here some algorithms
		bt.postOrderIterative(binaryTree.root);
	}
	
	private static BinaryTree initializeBinaryTree() {
		BinaryTree bt = new BinaryTree(9);
		bt.insert("N1");
		bt.insert("N2");
		bt.insert("N3");
		bt.insert("N4");
		bt.insert("N5");
		bt.insert("N6");
		bt.insert("N7");
		bt.insert("N8");
		bt.insert("N9");
		return bt;
	}
	
	
	private static BinaryTreeLL initializeTreeLL(){
		
		BinaryTreeLL binaryTree = new BinaryTreeLL();
		BinaryNode n1 = new BinaryNode();
		n1.value = "N1";
		BinaryNode n2 = new BinaryNode();
		n2.value = "N2";
		BinaryNode n3 = new BinaryNode();
		n3.value = "N3";
		BinaryNode n4 = new BinaryNode();
		n4.value = "N4";
		BinaryNode n5 = new BinaryNode();
		n5.value = "N5";
		BinaryNode n6 = new BinaryNode();
		n6.value = "N6";
		BinaryNode n7 = new BinaryNode();
		n7.value = "N7";
		BinaryNode n8 = new BinaryNode();
		n8.value = "N8";
		BinaryNode n9 = new BinaryNode();
		n9.value = "N9";
		
		
		n1.left = n2;
		n1.right = n3;
		
		n2.left = n4;
		n2.right = n5;
	
		n3.left = n6;
		n3.right = n7;
		
		n4.left = n8;
		n4.right = n9;
		
		binaryTree.root = n1;
		
		return binaryTree;
	
	}
}
