package br.edu.ifpe.avl;

import br.edu.ifpe.excecao.AVLTreeException;

public class Main {
    public static void main(String[] args) {
        try {
            AVLTree<Integer> avlTree = new AVLTree<>();

            avlTree.insert(10);
            avlTree.insert(20);
            avlTree.insert(30);
            avlTree.insert(40);
            avlTree.insert(50);
            avlTree.insert(25);

            System.out.println("Busca 30: " + avlTree.search(30));
            System.out.println("Busca 15: " + avlTree.search(15));

            avlTree.remove(30);
            avlTree.remove(40);

            System.out.println("Impressão em ordem:");
            avlTree.inOrderTraversal();
            
            System.out.println("\nImpressão em Pré ordem:");
            avlTree.preOrderTraversal();

            System.out.println("\nAltura da árvore: " + avlTree.getHeight());

            System.out.println("Árvore está vazia? " + avlTree.isEmpty());

            avlTree.clear();
            System.out.println("Árvore está vazia após limpeza? " + avlTree.isEmpty());
        } catch (AVLTreeException e) {
            e.printStackTrace();
        }
    }
}
