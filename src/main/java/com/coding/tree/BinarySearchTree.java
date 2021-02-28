package com.coding.tree;

public class BinarySearchTree {

    private int element;
    private BinarySearchTree left;
    private BinarySearchTree right;


    public BinarySearchTree(Integer root){
        this.element = root;
    }
    public BinarySearchTree getLeft() {
        return left;
    }
    public BinarySearchTree getRight() {
        return right;
    }
    public Integer getElement(){
        return element;
    }


    public BinarySearchTree insert(Integer insertElement){
        return insert(this, insertElement);
    }

    private BinarySearchTree insert(BinarySearchTree tree, Integer insertElement){

        if(tree == null){
            return null;
        }

        if(tree.getElement() >= insertElement){
            if(tree.left == null){
                tree.left = new BinarySearchTree(insertElement);
            }else{
                insert(tree.left, insertElement);
            }
        }

        if(tree.getElement() < insertElement){
            if(tree.right == null){
                tree.right = new BinarySearchTree(insertElement);
            }else{
                insert(tree.right, insertElement);
            }
        }

        return tree;
    }

    private BinarySearchTree search(BinarySearchTree tree, int element){
        if(tree != null){
            if(tree.element == element){
                return tree;
            }

            BinarySearchTree leftNode = search(tree.getLeft(), element);
            if(leftNode != null){
                return leftNode;
            }
            BinarySearchTree rightNode = search(tree.getRight(), element);
            if(rightNode != null){
                return rightNode;
            }
        }

        return null;
    }
    public BinarySearchTree delete(Integer element){
        BinarySearchTree tree = search(this, element);

        if(tree != null){
            if(tree.getLeft() != null){
                tree = tree.left;
            }
        }

        return tree;
    }

    public Integer search(Integer element){

        return null;
    }

    public Integer getRandomNode(){
        return null;
    }


}
