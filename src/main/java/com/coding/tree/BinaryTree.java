package com.coding.tree;

public class BinaryTree<T> {

    private T element;
    private BinaryTree<T> left;
    private BinaryTree<T> right;


    public BinaryTree(T root){
        this.element = root;
    }
    public BinaryTree<T> getLeft() {
        return left;
    }

    public BinaryTree<T> getRight() {
        return right;
    }

    public T getElement(){
        return element;
    }


    public BinaryTree<T> insert(T element){

        if(element != null){
            return insert(this, element);
        }

        return this;
    }

    private BinaryTree<T> insert(BinaryTree<T> tree, T insertElement){

        if(tree.getLeft() == null){
            tree.left = new BinaryTree<>(insertElement);
            return tree;
        }

        if(tree.getRight() == null){
            tree.right = new BinaryTree<>(insertElement);
            return tree;
        }

        if(tree.getLeft() != null){
            return insert(tree.getLeft(),insertElement);
        }

        if(tree.getRight() != null){
            return insert(tree.getRight(),insertElement);
        }
        return null;
    }

    private BinaryTree<T> search(BinaryTree<T> tree, T element){
        if(tree != null){
            if(tree.element.equals(element)){
                return tree;
            }

            BinaryTree<T> leftNode = search(tree.getLeft(), element);
            if(leftNode != null){
                return leftNode;
            }
            BinaryTree<T> rightNode = search(tree.getRight(), element);
            if(rightNode != null){
                return rightNode;
            }
        }

        return null;
    }
    public BinaryTree<T> delete(T element){
        BinaryTree<T> tree = search(this, element);

        if(tree != null){
            if(tree.getLeft() != null){
                tree = tree.left;
            }
        }

        return tree;
    }

    public T search(T element){

        return null;
    }

    public T getRandomNode(){
        return null;
    }


}
