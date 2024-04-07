package it.binarytree;

public class BinaryTree {

	String[] arr;
	int lastUsedIndex;
	
	public BinaryTree(int size) {
		arr = new String[size + 1];
		this.lastUsedIndex = 0;
		System.out.println("Blan Tree of size "+ size + " has been created");
	}
	
	public boolean isFull() {
		if(arr.length-1 == lastUsedIndex) {
			return true;
		} else {
			return false;
		}
	}
	
	public void insert(String value) {
		if(!isFull()) {
			arr[lastUsedIndex +1] = value;
			lastUsedIndex++;
			System.out.println("The value "+ value + " has been iserted");
		} else {
			System.out.println("The bt is full");
		}
	} 
	
	public void preOrder(int index) {
		if(index > lastUsedIndex) {
			return;
		}
		System.out.print(arr[index] + " ");
		preOrder(index * 2);
		preOrder(index * 2 + 1);
	}
	
	
	public void inOrder(int index) {
		if(index > lastUsedIndex) {
			return;
		}
		inOrder(index * 2);
		System.out.print(arr[index] + " ");
		inOrder(index * 2 + 1);
	}
	
	
}
