package com.coding.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void insert() {
        BinarySearchTree binarySearchTree = new BinarySearchTree(1);
        BinarySearchTree insertTree = binarySearchTree.insert(2);
        binarySearchTree.insert(3);
        binarySearchTree.insert(4);
        assert insertTree.getElement() == 1;
        assert insertTree.getRight().getElement() == 2;
    }
}