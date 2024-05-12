package it.trie;

public class Trie {

	
	private TrieNode root;
	public Trie () {
		root = new TrieNode();
		System.out.println("The trie has been created!");
	}
	
	public void insert(String word) {
		TrieNode current = root;
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			if(node == null) {
				node = new TrieNode();
				current.children.put(ch, node);
			}
			current = node;
			
		}
		current.endOfString = true;
		System.out.println("Successfully inserted " + word + " in Trie");
	}
	
	public boolean search(String word) {
		TrieNode currentNode = root;
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = currentNode.children.get(ch);
			if(node == null) {
				System.out.println("World : " + word + " does not exists in the trie");
				return false;
			}
			
			currentNode = node;
		}
		if(currentNode.endOfString == true) {
			System.out.println("World : " + word + " does exists in the trie");
			return true;
		} else {
			System.out.println("World : " + word + " does not exists in the trie. But it is a prefix of another string");
		}
		
		return currentNode.endOfString;
	}
	
}
