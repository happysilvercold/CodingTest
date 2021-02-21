package com.coding.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void insert() {

        BinaryTree.Node<Integer> root  = new BinaryTree.Node<>(1,
                new BinaryTree.Node<>(2, null, null),
                null);
        BinaryTree<Integer> binaryTree = new BinaryTree<>(root);
        BinaryTree.Node<Integer> addTree = binaryTree.insert(4);
        assert addTree.getRightElement().getElement() == 4 ;

    }

    @Test
    void delete() {
    }

    @Test
    void search() {
    }

    @Test
    void getRandomNode() {
    }
}