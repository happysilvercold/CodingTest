package com.coding.sorting;


public class CharSorting {

    public char[] mergeSort(char[] array){
        char[] helper = new char[array.length];
        mergeSort(array, helper, 0, array.length-1);
        return array;
    }
    public char[] mergeSort(char[] array, char[] helper, int low, int high){
        if(low<high){
            int middle = (low + high) / 2;
            mergeSort(array, helper, low, middle);
            mergeSort(array, helper, middle+1, high);
            merge(array, helper, low, middle, high);
            return array;
        }
        return array;
    }

    public char[] merge(char[] array, char[] helper, int low, int middle, int high){
        for(int i = low; i <= high; i++){
            helper[i] = array[i];
        }
        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while(helperLeft <= middle && helperRight <=high){
            if(helper[helperLeft] <= helper[helperRight]){
                array[current] = helper[helperLeft];
                helperLeft++;
            }else{
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        for(int i = 0; i<=remaining; i++){
            array[current+i] = helper[helperLeft+i];
        }
        return array;
    }
}