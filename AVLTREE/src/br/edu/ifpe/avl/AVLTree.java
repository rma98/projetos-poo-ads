package br.edu.ifpe.avl;

import br.edu.ifpe.excecao.AVLTreeException;

public class AVLTree<T extends Comparable<T>> implements AVLTreeOperations<T> {
    private Node<T> root;

    @Override
    public void insert(T key) throws AVLTreeException {
        if (key == null) {
            throw new AVLTreeException("Chave não pode ser nula");
        }
        root = insertRecursive(root, key);
    }

    private Node<T> insertRecursive(Node<T> node, T key) {
        if (node == null) {
            return new Node<>(key);
        }

        if (key.compareTo(node.key) < 0) {
            node.left = insertRecursive(node.left, key);
        } else if (key.compareTo(node.key) > 0) {
            node.right = insertRecursive(node.right, key);
        } else {
            
            return node;
        }
        
        node.height = 1 + Math.max(height(node.left), height(node.right));
        
        return balance(node, key);
    }

    @Override
    public boolean search(T key) throws AVLTreeException {
        if (key == null) {
            throw new AVLTreeException("Chave não pode ser nula");
        }
        return searchRecursive(root, key);
    }

    private boolean searchRecursive(Node<T> node, T key) {
        if (node == null) {
            return false;
        }

        if (key.compareTo(node.key) < 0) {
            return searchRecursive(node.left, key);
        } else if (key.compareTo(node.key) > 0) {
            return searchRecursive(node.right, key);
        } else {
            return true; 
        }
    }

    @Override
    public void remove(T key) throws AVLTreeException {
        if (key == null) {
            throw new AVLTreeException("Chave não pode ser nula");
        }
        root = removeRecursive(root, key);
    }

    private Node<T> removeRecursive(Node<T> node, T key) {
        if (node == null) {
            return null;
        }

        if (key.compareTo(node.key) < 0) {
            node.left = removeRecursive(node.left, key);
        } else if (key.compareTo(node.key) > 0) {
            node.right = removeRecursive(node.right, key);
        } else {            

            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            
            node.key = minValue(node.right);
            node.right = removeRecursive(node.right, node.key);
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        
        return balance(node, key);
    }

    private T minValue(Node<T> node) {
        T minValue = node.key;
        while (node.left != null) {
            minValue = node.left.key;
            node = node.left;
        }
        return minValue;
    }

    private int height(Node<T> node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    private int balanceFactor(Node<T> node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    private Node<T> balance(Node<T> node, T key) {
        int balanceFactor = balanceFactor(node);

        
        if (balanceFactor > 1) {
            if (key.compareTo(node.left.key) < 0) {
                return rightRotate(node); // Rotação simples à direita
            } else {
                return leftRightRotate(node); // Rotação dupla à esquerda
            }
        }

        if (balanceFactor < -1) {
            if (key.compareTo(node.right.key) > 0) {
                return leftRotate(node); // Rotação simples à esquerda
            } else {
                return rightLeftRotate(node); // Rotação dupla à direita
            }
        }

        return node;
    }

    private Node<T> rightRotate(Node<T> y) {
        Node<T> x = y.left;
        Node<T> temp = x.right;

        x.right = y;
        y.left = temp;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private Node<T> leftRotate(Node<T> x) {
        Node<T> y = x.right;
        Node<T> temp = y.left;

        y.left = x;
        x.right = temp;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    private Node<T> leftRightRotate(Node<T> node) {
        node.left = leftRotate(node.left);
        return rightRotate(node);
    }

    private Node<T> rightLeftRotate(Node<T> node) {
        node.right = rightRotate(node.right);
        return leftRotate(node);
    }
    
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node<T> node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.key + " ");
            inOrderTraversal(node.right);
        }
    }
    
    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node<T> node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }
    
    public int getHeight() {
        return getHeight(root);
    }

    private int getHeight(Node<T> node) {
        if (node == null)
            return 0;
        return node.height;
    }
    
    public boolean isEmpty() {
        return root == null;
    }

    public void clear() {
        root = null;
    }
}
