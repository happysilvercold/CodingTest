package com.coding.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    void size() {
        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(2);

        assert queue.size()==2;
    }

    @Test
    void add() {
        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(2);
        int value = (int) queue.peek();
        assert value == 1;
    }

    @Test
    void remove() {
        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        assert queue.size() ==3;
        queue.remove();

        assert queue.size() == 2;
        assert (int) queue.peek() == 2;
    }

    @Test
    void peek() {
    }
}