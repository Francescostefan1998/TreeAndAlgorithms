package it.avltree;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {

	BinaryNodeAVL root;
	
	public AVL(){
		root = null;
	}
	
	public void preOrder(BinaryNodeAVL node) {
		if(node == null) {
			return;
		}
		System.out.print(node.value + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void inOrder(BinaryNodeAVL node) {
		if(node == null) {
			return;
		}
		preOrder(node.left);
		System.out.print(node.value + " ");
		preOrder(node.right);		
		
	}
	
	public void postOrder(BinaryNodeAVL node) {
		if(node == null) {
			return;
		}
		preOrder(node.left);
		preOrder(node.right);		
		System.out.print(node.value + " ");
		
	}
	
	
	public void levelOrder() {
		if(root == null) {
			return;
		}
		
		Queue<BinaryNodeAVL> queue = new LinkedList<BinaryNodeAVL>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			BinaryNodeAVL toPrint  = queue.remove();
			System.out.print(toPrint.value + " ");
			if(toPrint.left != null) {
				queue.add(toPrint.left);
			}
			if(toPrint.right!= null) {
				queue.add(toPrint.right);
			}
		}
	}
	
	
	public BinaryNodeAVL search(BinaryNodeAVL node, int value) {
		if(node == null) {
			System.out.println("Value: "+ value + " not found in the AVL tree");
			return null;
		} else if(node.value == value) {
			System.out.println("Value: "+ value + " found in the AVL tree");
			return node;
		} else if(value < node.value) {
			return search(node.left, value);
		} else {
			return search(node.right,value);
		}
	}
	
	
	public int getHeight(BinaryNodeAVL node) {
		if(node == null) {
			return 0;
		}
		return node.height;
	}
	
	private BinaryNodeAVL rotateRight(BinaryNodeAVL disbalancedNode) {
		BinaryNodeAVL newRoot = disbalancedNode.left;
		disbalancedNode.left = disbalancedNode.left.right;
		newRoot.right = disbalancedNode;
		disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
		newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
		return newRoot;
	}
	
	
	private BinaryNodeAVL rotateLeft(BinaryNodeAVL disbalancedNode) {
		BinaryNodeAVL newRoot = disbalancedNode.right;
		disbalancedNode.right = disbalancedNode.right.left;
		newRoot.left = disbalancedNode;
		disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
		newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
		return newRoot;
	}
	
	public int getBalanced(BinaryNodeAVL node) {
		if(node == null) {
			return 0;
		}
		
		return getHeight(node.left) - getHeight(node.right);
	}
	
	private BinaryNodeAVL insertNode(BinaryNodeAVL node, int nodeValue) {
		if(node == null) {
			BinaryNodeAVL newNode = new BinaryNodeAVL();
			newNode.value = nodeValue;
			newNode.height = 1;
			return newNode;
		} else if(nodeValue < node.value) {
			node.left = insertNode(node.left, nodeValue);
		} else {
			node.right = insertNode(node.right, nodeValue);
		}
	
		node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
		int balance = getBalanced(node);
		
		if(balance > 1 && nodeValue < node.left.value) {
			return rotateRight(node);
		}
		
		if(balance > 1 && nodeValue < node.left.right.value) {
			node.left = rotateLeft(node.left);
			return rotateRight(node);
		}
		
		if(balance < -1 && nodeValue > node.right.value) {
			return rotateLeft(node);
		}
		
		if(balance < -1 && nodeValue < node.right.value) {
			node.right = rotateRight(node.right);
			return rotateLeft(node);
		}
		
		return node;
	
	}
	
	public void insert(int value) {
		root = insertNode(root, value);
	}
	

}
