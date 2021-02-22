package com.coding.tree;

public class BinaryTree<T> {

    private Node<T> root;
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

    private Node<T> search(Node<T> node, T element){
        if(node != null){
            if(node.element.equals(element)){
                return node;
            }

            Node<T> leftNode = search(node.getLeftElement(), element);
            if(leftNode != null){
                return leftNode;
            }
            Node<T> rightNode = search(node.getRightElement(), element);
            if(rightNode != null){
                return rightNode;
            }
        }

        return null;
    }
    public Node<T> delete(T element){
        Node<T> node = search(root, element);

        if(node != null){
            if(node.getLeftElement() != null){
                node = node.leftElement;
            }
        }

        return root;
    }

    public T search(T element){

        return null;
    }

    public T getRandomNode(){
        return null;
    }
}
