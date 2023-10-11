package SearchBinaryTree;

import java.util.*;

public class SearchBinaryTree<Type extends Comparable<Type>> {

	public Node<Type> root;

	public SearchBinaryTree() {
		root = null;
	}

	public void insert(Type element) {
		root = insertRecursive(root, element);
	}

	public Node<Type> insertRecursive(Node<Type> current, Type element) {
		if (current == null) {
			return new Node<Type>(element);
		}

		if (element.compareTo(current.getData()) < 0) {
			current.setLeft(insertRecursive(current.getLeft(), element));
		} else if (element.compareTo(current.getData()) > 0) {
			current.setRight(insertRecursive(current.getRight(), element));
		}

		return current;
	}

	public void inOrder() throws ElementEmptyException {
		if (root == null) {
			throw new ElementEmptyException("A árvore está vazia.");
		}
		inOrderRecursive(root);
		System.out.println();
	}

	public void inOrderRecursive(Node<Type> node) {
		if (node != null) {
			inOrderRecursive(node.getLeft());
			System.out.print(node.getData() + " ");
			inOrderRecursive(node.getRight());
		}
	}
	public void preOrder() throws ElementEmptyException {
		if (root == null) {
			throw new ElementEmptyException("A árvore está vazia.");
		}
		preOrderRecursive(root);
		System.out.println();
	}

	public void preOrderRecursive(Node<Type> node) {
		if (node != null) {
			System.out.print(node.getData() + " ");
			inOrderRecursive(node.getLeft());
			inOrderRecursive(node.getRight());
		}
	}

	public void posOrder() throws ElementEmptyException {
		if (root == null) {
			throw new ElementEmptyException("A árvore está vazia.");
		}
		posOrderRecursive(root);
		System.out.println();
	}

	public void posOrderRecursive(Node<Type> node) {
		if (node != null) {
			inOrderRecursive(node.getLeft());
			inOrderRecursive(node.getRight());
			System.out.print(node.getData() + " ");
		}
	}
	public Type findMin() throws ElementEmptyException {
		if (root == null) {
			throw new ElementEmptyException("A árvore está vazia.");
		}
		return findMinRecursive(root);
	}

	private Type findMinRecursive(Node<Type> node) {
		if (node.getLeft() == null) {
			return node.getData();
		}
		return findMinRecursive(node.getLeft());
	}
	public Type findMax() throws ElementEmptyException {
		if (root == null) {
			throw new ElementEmptyException("A árvore está vazia.");
		}
		return findMaxRecursive(root);
	}

	private Type findMaxRecursive(Node<Type> node) {
		if (node.getRight() == null) {
			return node.getData();
		}
		return findMaxRecursive(node.getRight());
	}
	public void levelOrderTraversal() throws ElementEmptyException {
		if (root == null) {
			throw new ElementEmptyException("A árvore está vazia.");
		}

		Queue<Node<Type>> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node<Type> current = queue.poll();
			System.out.print(current.getData() + " ");

			if (current.getLeft() != null) {
				queue.add(current.getLeft());
			}

			if (current.getRight() != null) {
				queue.add(current.getRight());
			}
		}
		System.out.println();
	}
	public void remove(Type e) {
		root = removeRecursive(root, e);
	}

	private Node<Type> removeRecursive(Node<Type> current, Type e) {
		if (current == null) {
			return current; // Nada a fazer, o nó não existe
		}
		if (e.compareTo(current.getData()) < 0) {
			current.setLeft(removeRecursive(current.getLeft(), e));
		} else if (e.compareTo(current.getData()) > 0) {
			current.setRight(removeRecursive(current.getRight(), e));
		} else { // Nó a ser removido encontrado
			// Caso 1: Nó folha ou com um filho
			if (current.getLeft() == null) {
				return current.getRight();
			} else if (current.getRight() == null) {
				return current.getLeft();
			}
			current.setData(findMinRecursive(current.getRight())); // Encontra o nó sucessor
			current.setRight(removeRecursive(current.getRight(), current.getData())); // Remove o nó sucessor
		}
		return current;
	}

}