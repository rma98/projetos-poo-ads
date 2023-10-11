package SearchBinaryTree; /*Dupla: Everton Juan e Robson Albuquerque */

public class AppMain {

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
			tree.insert(2);

			System.out.println("Elementos em in ordem:");
			tree.inOrder();
			System.out.println();
			
			System.out.println("Elementos em pré ordem:");
			tree.preOrder();
			System.out.println();
			
			System.out.println("Elementos em pós ordem:");
			tree.posOrder();
			System.out.println();
			
			System.out.println("Nível de ordem:");
            tree.levelOrderTraversal();
            
            tree.remove(4);
            System.out.println("Árvore após a remoção de 4 em ordem:");
            tree.inOrder();

            tree.remove(3);
            System.out.println("Árvore após a remoção de 3 em ordem:");
            tree.inOrder();

            tree.remove(5);
            System.out.println("Árvore após a remoção de 5 em ordem:");
            tree.inOrder();

			SearchBinaryTree<Integer> emptyTree = new SearchBinaryTree<>();
			emptyTree.inOrder(); // Isso lançará a exceção TreeEmptyException
		} catch (ElementEmptyException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
