package com.coding.tree;

import java.util.Random;

public class TreeNode {

    private Integer data;
    public TreeNode left;
    public TreeNode right;
    private int size = 0;

    public TreeNode(Integer d){
        data = d;
        size = 1;
    }

    public int getSize(){
        return size;
    }

    public Integer getData(){
        return data;
    }

    public TreeNode find(Integer searchData){
        if(searchData.equals(data)){
            return this;
        }else if(searchData < data) {
            return left != null ? left.find(searchData) : null;
        }else if(searchData > data){
            return right != null ? right.find(searchData) : null;
        }
        return null;
    }

    public void insertInOrder(Integer insertData){
        if(insertData <= data){
            if(left == null){
                left = new TreeNode(insertData);
            }else{
                left.insertInOrder(insertData);
            }
        }else{
            if(right == null){
                right = new TreeNode(insertData);
            }else{
                right.insertInOrder(insertData);
            }
        }
        size++;
    }

    public TreeNode getRandomNode(){
        int leftSize = left == null ? 0 : left.getSize();
        Random random = new Random();
        int index = random.nextInt();

        if(index < leftSize){
            return leftSize == 0 ? null : left.getRandomNode();
        }else if(index == leftSize){
            return this;
        }else{
            return right.getRandomNode();
        }
    }
}
