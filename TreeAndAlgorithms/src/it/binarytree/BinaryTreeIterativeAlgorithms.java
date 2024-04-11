package it.binarytree;

import java.util.Stack;

public class BinaryTreeIterativeAlgorithms {
	
	 public void postOrderTraversal(BinaryNode root) {
	       //  TODO
	        if(root == null){
	            return;
	        }
	        
	        BinaryNode current = root;
	        Stack<BinaryNode> stack = new Stack<>();
	        stack.push(root);
	        while(!stack.isEmpty()){
	            if(current.right != null){
	                stack.push(current.right);
	                
	            }
	            if(current.left != null){
	                stack.push(current.left);
	                
	            }
	            
	            BinaryNode present = stack.pop();
	            current = present;
	            if(current.left == null && current.right == null){
	                System.out.print(current.value  + " ");
	            }
	        }
	 }
	
	
	
}