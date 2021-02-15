package com.coding.sorting;

import java.util.Arrays;

/**
 * problem : https://programmers.co.kr/learn/courses/30/lessons/42748
 */
public class KthSorting {

    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for(int commandIndex = 0 ; commandIndex < commands.length; commandIndex++){
            int[] command = commands[commandIndex];
            int firstIndex = command[0];
            int lastIndex = command[1];
            int orderNumber = command[2];

            //TODO exception
            if(firstIndex > lastIndex || (orderNumber-1) > lastIndex){
                answer[commandIndex] = 0;
                continue;
            }

            if(firstIndex == lastIndex && lastIndex ==1){
                answer[commandIndex] = array[firstIndex-1];
                continue;
            }

            int filterLength = lastIndex - firstIndex + 1;
            int[] filterArray = new int[filterLength];
            System.arraycopy(array, firstIndex-1, filterArray, 0, filterLength);
            answer[commandIndex] = Arrays.stream(filterArray).sorted().skip(orderNumber-1).findAny().getAsInt();
            System.out.println(answer[commandIndex]);
        }

        return answer;
    }

    public int[] solutionByAnother(int[] array, int[][] commands){
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
