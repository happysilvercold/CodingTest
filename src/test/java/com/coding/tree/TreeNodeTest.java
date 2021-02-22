package com.coding.tree;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest {

    @Test
    void find() {
        TreeNode treeNode = new TreeNode(1);
        assert treeNode.find(1).getData() == 1;
    }

    @Test
    void insertInOrder() {
        TreeNode treeNode = new TreeNode(2);
        treeNode.insertInOrder(3);
        assert treeNode.right.getData() == 3;

        treeNode.insertInOrder(4);
        treeNode.insertInOrder(5);
        assert treeNode.left == null;
    }

    @Test
    void getRandomNode() {
        TreeNode treeNode = new TreeNode(2);
        treeNode.insertInOrder(3);
        assert treeNode.right.getData() == 3;

        treeNode.insertInOrder(4);
        treeNode.insertInOrder(5);

        TreeNode randomTree = treeNode.getRandomNode();
        assert randomTree != null;
    }
}