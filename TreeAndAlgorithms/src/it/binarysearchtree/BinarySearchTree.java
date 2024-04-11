package it.binarysearchtree;

public class BinarySearchTree {

	BinaryNode root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	
	private BinaryNode insert(BinaryNode currentNode, int value) {
		
		if(currentNode == null) {
			BinaryNode newNode = new BinaryNode();
			newNode.value = value;
			System.out.println("The value is inserted!");
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
		insert(root, value);
	}
	
	
	
}
