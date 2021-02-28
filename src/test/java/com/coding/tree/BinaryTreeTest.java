package com.coding.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void insert() {

        BinaryTree<Integer> tree  = new BinaryTree<>(1);
        BinaryTree<Integer> insertTree = tree.insert(4);
        assert insertTree.getLeft().getElement() == 4 ;

    }

    @Test
    void delete() {
        BinaryTree<Integer> tree  = new BinaryTree<>(1);
        tree.insert(4);
        tree.insert(5);
        BinaryTree<Integer> deleteTree = tree.delete(5);
        assert deleteTree.getElement() == 1 ;
    }

    @Test
    void search() {
    }

    @Test
    void getRandomNode() {
    }
}