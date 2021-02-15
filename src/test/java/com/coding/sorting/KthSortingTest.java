package com.coding.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSortingTest {

    @Test
    void solution() {
        KthSorting kthSorting = new KthSorting();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};

        int[] result = kthSorting.solution(array, commands);
        assert result.length == commands.length;
        assert result[0] == 5;
        assert result[1] == 6;
        assert result[2] == 3;
    }

    @Test
    void solutionByAnother(){
        KthSorting kthSorting = new KthSorting();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};

        int[] result = kthSorting.solutionByAnother(array, commands);
        assert result.length == commands.length;
        assert result[0] == 5;
        assert result[1] == 6;
        assert result[2] == 3;
    }
}