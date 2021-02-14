package com.coding.sorting;

/**
 * 문제 : 정렬된 배열 A와 B가 주어진다. A의 끝에는 B를 전부 넣을 수 있을 만큼 충분한 여유공간이 있다.
 * B와 A를 정렬된 상태로 병합하는 메서드를 작성하라.
 */
public class MergeSortedArray {

    /**
     * 문제
     * @param a
     * @param b
     * @return
     */
    public int[] merge(int[] a, int[] b){

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
}
