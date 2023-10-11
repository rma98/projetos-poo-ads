package br.edu.ifpe.searchbinarytree;

public class Node<T> {
	T data;
	Node left;
	Node right;
	
	public Node(T data) {
		this.data = data;
		left = null;
		right = null;
	}
}
