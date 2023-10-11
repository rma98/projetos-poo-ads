package br.edu.ifpe.searchbinarytree;

public class SearchBinaryTree<T extends Comparable <T>> {
	Node root;
	
	public SearchBinaryTree() {
		root = null;
	}
	
	public void insert(T e) {
		root = insertRecursive(root, e);
	}
	
	public Node insertRecursive(Node current, T  e) {
		if (current == null) {
			return new Node(e);
		}
		if (e.compareTo((T) current.data) < 0) {
			current.left = insertRecursive(current.left, e);
		} else if (e.compareTo((T) current.data) > 0) {
			current.right = insertRecursive(current.right, e);
		}
		return current;
	}
	
	public void inOrder() throws TreeEmptyException {
		if (root == null) {
			throw new TreeEmptyException("A árvore está vazia.");
		}
		inOrderRecursive(root);
		System.out.println();
	}
	
	public void inOrderRecursive(Node node) {
		if (node != null) {
			inOrderRecursive(node.left);
			System.out.println(node.data);
			inOrderRecursive(node.right);
		}
	} 
}
