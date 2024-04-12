package it.binarysearchtree;

public class BinarySearchTree {

	public BinaryNode root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	
	private BinaryNode insert(BinaryNode currentNode, int value) {
		
		if(currentNode == null) {
			BinaryNode newNode = new BinaryNode();
			newNode.value = value;
			return newNode;
		} else if(value <= currentNode.value) {
			currentNode.left = insert(currentNode.left, value);
			return currentNode;
		} else {
			currentNode.right = insert(currentNode.right, value);
			return currentNode;
		}
		
	}
	
	public void insert(int value) {
		root = insert(root, value);
	}
	
	public void preOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		System.out.println(node.value + " ");
		preOrder(node.left);
		
		preOrder(node.right);
	}
	
	
}
