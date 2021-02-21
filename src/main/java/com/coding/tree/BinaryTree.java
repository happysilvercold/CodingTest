package com.coding.tree;

public class BinaryTree<T> {

    static class Node<T>{
        private T element;
        private Node<T> leftElement;
        private Node<T> rightElement;

        public Node(T element, Node<T> leftElement, Node<T> rightElement){
            this.element = element;
            this.leftElement = leftElement;
            this.rightElement = rightElement;
        }

        public Node<T> getLeftElement(){
            return leftElement;
        }

        public Node<T> getRightElement(){
            return rightElement;
        }

        public T getElement(){
            return element;
        }
    }

    private Node<T> root;

    public BinaryTree(Node<T> root){
        this.root = root;
    }



    public Node<T> insert(T element){

        if(root != null){
            return insert(root, element);
        }

        return null;
    }

    private Node<T> insert(Node<T> node, T insertElement){

        if(node.getLeftElement() == null){
            node.leftElement = new Node<>(insertElement, null, null);
            return root;
        }

        if(node.getRightElement() == null){
            node.rightElement = new Node<>(insertElement, null, null);
            return root;
        }

        if(node.getLeftElement() != null){
            return insert(node.getLeftElement(),insertElement);
        }

        if(node.getRightElement() != null){
            return insert(node.getRightElement(),insertElement);
        }
        return null;
    }

    public void delete(T element){

    }

    public T search(T element){

        return null;
    }

    public T getRandomNode(){
        return null;
    }
}
