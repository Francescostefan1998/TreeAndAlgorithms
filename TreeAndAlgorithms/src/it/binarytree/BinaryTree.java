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
	
	public void postOrder(int index) {
		if(index > lastUsedIndex) {
			return;
		}
		postOrder(2*index);
		postOrder(2* index +1);
		System.out.print(arr[index] + " ");
	}
	
	public void levelOrder() {
		for(int i = 1; i <= lastUsedIndex; i++)
			System.out.print(arr[i] + " ");
	}
	
	public int search(String value) {
		for(int i = 1; i <= lastUsedIndex; i++) {
			if(arr[i] == value) {
				System.out.println(value + " exists at the locaiton of "+ i);
				return i;
			}
		}
		System.out.println(value + " does not exists in binary Tree" );
		return -1;
	}
	
	public void delete(String value) {
		int location = search(value);
		if(location == -1) {
			return;
		} else {
			arr[location] = arr[lastUsedIndex];
			lastUsedIndex--;
			System.out.println("The node successfully deleted");
		}
	}
	
}
