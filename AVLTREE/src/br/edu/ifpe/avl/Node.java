package br.edu.ifpe.avl;

public class Node<T extends Comparable<T>> {
    T key;
    int height;
    Node<T> left, right;

    public Node(T value) {
        key = value;
        height = 1;
    }
}
