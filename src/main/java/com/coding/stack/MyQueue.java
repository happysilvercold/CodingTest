package com.coding.stack;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class MyQueue<T> {

//    private Queue queue;
    private Stack stackNewest;
    private Stack stackOldest;

    public MyQueue(){
        stackNewest = new Stack();
        stackOldest = new Stack();
    }

    public int size(){
        return stackNewest.size() + stackOldest.size();
    }

    public void add(T value){
        stackNewest.push(value);
    }

    private void shiftStacks(){
        if(stackOldest.isEmpty()){
            while (!stackNewest.isEmpty()){
                stackOldest.push(stackNewest.pop());
            }
        }
    }

    public void remove(){
        shiftStacks();
        stackOldest.pop();
    }
    public T peek(){
        shiftStacks();
        return (T) stackOldest.peek();
    }

}
