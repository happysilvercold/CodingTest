package com.coding.sorting;

/**
 * Problem
 *  The ordered array A and array B are given.
 *  There is enough free space at the end of A to accommodate all B.
 *  Write a method that merges A and B into an ordered state.
 *
 */
public class MergeSortedArray {

    /**
     * resolution : make a new array
     */
    public int[] mergeByMakingNewArray(int[] a, int[] b){

        int aIndex = 0;
        int bIndex = 0;
        int currentIndx = 0;

        int[] mergeArray = new int[a.length+b.length];

        while(aIndex < a.length && bIndex < b.length){

            if(a[aIndex] > b[bIndex]){
                mergeArray[currentIndx] = b[bIndex];
                bIndex++;
            }else{
                mergeArray[currentIndx] = a[aIndex];
                aIndex++;
            }
            currentIndx++;
        }

        while(aIndex < a.length){
            mergeArray[currentIndx] = a[aIndex];
            aIndex++;
            currentIndx++;
        }

        while(bIndex < b.length){
            mergeArray[currentIndx] = b[bIndex];
            bIndex++;
            currentIndx++;
        }

        return mergeArray;
    }

    /**
     * resolution : use a existing a array. insert from the end of a array
     */
    public int[] mergeByOriginArray(int[] a, int[] b, int lastALength, int lastBLength){
        int aIndex = lastALength - 1;
        int bIndex = lastBLength - 1;
        int mergedIndex = lastALength + lastBLength-1;

        while (bIndex >= 0){
            if(aIndex >= 0 && a[aIndex] > b[bIndex]){
                a[mergedIndex] = a[aIndex];
                aIndex--;
            }else{
                a[mergedIndex] = b[bIndex];
                bIndex--;
            }
            mergedIndex--;
        }

        return a;
    }
}
