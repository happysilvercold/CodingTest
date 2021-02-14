package com.coding.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    void merge() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] a = {1,3,4};
        int[] b = {2,3,5};
        int[] mergeArray = mergeSortedArray.merge(a, b);

        assert mergeArray.length == (a.length+b.length);
        assert mergeArray[0] == 1;
    }
}