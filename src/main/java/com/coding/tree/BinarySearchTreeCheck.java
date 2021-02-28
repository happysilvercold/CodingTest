package com.coding.tree;

/**
 * problem : BST 검증 : 주어진 이진 트리가 이진탐색인지 확인하는 함수를 작성
 */
public class BinarySearchTreeCheck {

    public static boolean checkBinarySearchTree(BinarySearchTree binarySearchTree){

        if(binarySearchTree.getLeft() != null){
            if(binarySearchTree.getElement() < binarySearchTree.getLeft().getElement()){
                return false;
            }else{
                return BinarySearchTreeCheck.checkBinarySearchTree(binarySearchTree.getLeft());
            }
        }
        if(binarySearchTree.getRight() != null){
            if(binarySearchTree.getElement() > binarySearchTree.getRight().getElement()){
                return false;
            }else{
                return BinarySearchTreeCheck.checkBinarySearchTree(binarySearchTree.getRight());
            }
        }

        return true;
    }
}
