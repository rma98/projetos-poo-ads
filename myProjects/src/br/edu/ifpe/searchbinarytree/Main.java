package br.edu.ifpe.searchbinarytree;

public class Main {

	public static void main(String[] args) {
		try {
			SearchBinaryTree<Integer> tree = new SearchBinaryTree<>();
			tree.insert(5);
			tree.insert(3);
			tree.insert(8);
			tree.insert(1);
			tree.insert(4);
			tree.insert(7);
			tree.insert(9);
			
			System.out.println("Elementos em ordem:");
			tree.inOrder();
			System.out.println();
			
		} catch (TreeEmptyException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
