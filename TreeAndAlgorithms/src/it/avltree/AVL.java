package it.avltree;


public class AVL {

	BinaryNodeAVL root;
	
	public AVL(){
		root = null;
	}
	
	public void preOrder(BinaryNodeAVL node) {
		if(node == null) {
			return;
		}
		System.out.println(node.value + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	
	
}
