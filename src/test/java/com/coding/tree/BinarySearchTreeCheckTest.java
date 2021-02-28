package com.coding.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeCheckTest {

    @Test
    void checkBinarySearchTree() {

        BinarySearchTree binarySearchTree = new BinarySearchTree(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(3);
        binarySearchTree.insert(4);

        boolean result = BinarySearchTreeCheck.checkBinarySearchTree(binarySearchTree);

        assert result;
//
//        BinaryTree.Node<Integer> root  = new BinaryTree.Node<>(1,
//                new BinaryTree.Node<>(2, null, null),
//                null);
//        BinaryTree<Integer> binaryTree = new BinaryTree<>(root);
//        BinaryTree.Node<Integer> addTree = binaryTree.insert(4);
//
//        BinarySearchTreeCheck.checkBinarySearchTree(addTree);
    }
}