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

}
