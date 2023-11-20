package br.edu.ifpe.avl;

import br.edu.ifpe.excecao.AVLTreeException;

public interface AVLTreeOperations<T extends Comparable<T>> {
    void insert(T key) throws AVLTreeException;
    boolean search(T key) throws AVLTreeException;
    void remove(T key) throws AVLTreeException;
}
