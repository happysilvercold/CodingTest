package com.coding.tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimalBinarySearchTreeTest {

    @Test
    void makeBinarySearchTree() {

        List<Integer> sortedArray = new ArrayList<>();
        sortedArray.add(1);

        MinimalBinarySearchTree convertTree = MinimalBinarySearchTree.makeBinarySearchTree(sortedArray);

        assert convertTree.getData() == 1;

    }


    @Test
    void makeBinarySearchTree_2() {

        List<Integer> sortedArray = new ArrayList<>();
        sortedArray.add(1);
        sortedArray.add(2);
        sortedArray.add(3);
        sortedArray.add(4);
        sortedArray.add(5);
        sortedArray.add(6);

        MinimalBinarySearchTree convertTree2 = MinimalBinarySearchTree.makeBinarySearchTree(sortedArray);

        assert convertTree2.getData() == 3;
    }


}