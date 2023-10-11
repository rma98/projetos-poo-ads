package SearchBinaryTree;

public class Node <Type> {
	
	private Type data;
	private Node <Type> left;
	private Node <Type> right;

	public Node(Type data) {
		this.data = data;
		left = null;
		right = null;
	}

	public Type getData() {
		return data;
	}

	public void setData(Type data) {
		this.data = data;
	}

	public Node<Type> getLeft() {
		return left;
	}

	public void setLeft(Node<Type> left) {
		this.left = left;
	}

	public Node<Type> getRight() {
		return right;
	}

	public void setRight(Node<Type> right) {
		this.right = right;
	}

}