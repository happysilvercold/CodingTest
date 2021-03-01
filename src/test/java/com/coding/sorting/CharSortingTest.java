package com.coding.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharSortingTest {

    @Test
    void mergeSort() {
        CharSorting charSorting = new CharSorting();
        char[] originSort = new char[]{'o', 'p','a', 'b', 'c'};
        charSorting.mergeSort(originSort);
        assert originSort[0] == 'a';

    }
}