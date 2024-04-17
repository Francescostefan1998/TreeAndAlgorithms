package it.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
		System.out.print(node.value + " ");
		preOrder(node.left);
		
		preOrder(node.right);
	}
	
	public void inOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.value + " ");
		inOrder(node.right);
	}
	
	public void postOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		inOrder(node.right);
		System.out.print(node.value + " ");
	}
	
	
	public void levelOrder() {
		if(root == null) {
			return;
		}
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>(); 
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.out.print(presentNode.value + " ");
			if(presentNode.left != null) queue.add(presentNode.left);
			if(presentNode.right != null) queue.add(presentNode.right);

		}
	}
	
	
	public BinaryNode search(BinaryNode node, int value) {
		if(node == null) {
			System.out.println("Value "+ value + " not found in bst!");
			return null;
		} else if(node.value == value) {
			System.out.println("Value "+ value + "  found in bst!");
			return node;
		} else if (value < node.value) {
			return search(node.left, value);
		} else {
			return search(node.right, value);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
