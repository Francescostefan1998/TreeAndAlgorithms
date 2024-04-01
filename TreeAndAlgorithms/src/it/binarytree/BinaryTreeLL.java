package it.binarytree;

public class BinaryTreeLL {


		public BinaryNode root;
		
		public BinaryTreeLL() {
			this.root = null;
		}
		
		public void preOrder(BinaryNode node) {
			if(node == null) {
				return;
			}
			
			System.out.print(node.value + " ");
			
			preOrder(node.left);
			preOrder(node.right);
			
		}



}


