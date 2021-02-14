package com.coding.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {


    @Test
    void testMergeByMakingNewArray() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] a = {1,3,4};
        int[] b = {2,3,5};
        int[] mergeArray = mergeSortedArray.mergeByMakingNewArray(a, b);

        assert mergeArray.length == (a.length+b.length);
        assert mergeArray[0] == 1;
        assert mergeArray[mergeArray.length-1] == 5;
    }

    @Test
    void mergeByOriginArray() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] a = new int[6];
        a[0] = 1;
        a[1] = 3;
        a[2] = 4;
        int[] b = {2,3,5};
        int[] mergeArray = mergeSortedArray.mergeByOriginArray(a, b, 3, b.length);

        assert mergeArray.length == (a.length);
        assert mergeArray[0] == 1;
        assert mergeArray[mergeArray.length-1] == 5;
    }
}