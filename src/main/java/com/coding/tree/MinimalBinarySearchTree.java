package com.coding.tree;

import java.util.List;

/**
 * problem
 * 4.2 최소트리
 * 오름차순으로 정렬된 배열이 있다. 이 배열 안에 들어있는 원소는 정수이며, 중복된 값이 없다고 했을때 높이가 최소가 되는 이진탐색 트리를 만드는 알고리즘을 작성하라.
 * - 주의사항 : Off-by-one error 알고리즘 / 메모리 경계조건 주의 필요함.
 */
public class MinimalBinarySearchTree {
    private Integer data;
    private MinimalBinarySearchTree left;
    private MinimalBinarySearchTree right;
    private int size = 0;


    public MinimalBinarySearchTree(Integer d){
        data = d;
        size = 1;
    }

    public Integer getData(){ return data;}
    public MinimalBinarySearchTree getLeft(){return left;}
    public MinimalBinarySearchTree getRight(){return right;}
    public int getSize(){return size;}

    public static MinimalBinarySearchTree makeBinarySearchTree(List<Integer> sortArray){
        //오름차순으로 정렬됨.
        int middleSize = sortArray.size()/2;
        int leftSize = sortArray.size() / 2 - 1;
        int rightSize = sortArray.size() / 2 + 1;

        if(sortArray.size() == 0){
            return null;
        }

        if(sortArray.size() == 1){
            return new MinimalBinarySearchTree(sortArray.get(0));
        }

        MinimalBinarySearchTree searchTree = new MinimalBinarySearchTree(sortArray.get(middleSize));
        searchTree.left = MinimalBinarySearchTree.makeBinarySearchTree(sortArray.subList(0, leftSize+1));
        searchTree.right = MinimalBinarySearchTree.makeBinarySearchTree(sortArray.subList(rightSize, sortArray.size()));

        return searchTree;

    }
}
