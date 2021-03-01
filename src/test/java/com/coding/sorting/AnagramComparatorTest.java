package com.coding.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AnagramComparatorTest {

    @Test
    void sortChar() {
        String[] originArray = {"o", "a", "p"};
        Arrays.sort(originArray, new AnagramComparator());
        assert originArray[0].equals("a");
    }
}