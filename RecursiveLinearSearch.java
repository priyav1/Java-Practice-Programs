package com.priya.algorithms;

/**
 * Created by priya on 07/08/18.
 */
public class RecursiveLinearSearch {
    public static int recursiveLinearSearch(int[] inputArray, int pointer, int value){
        if(pointer>=inputArray.length-1){
            return -1;
        }
        if(inputArray[pointer]==value){
            return pointer;
        }
        return recursiveLinearSearch(inputArray, pointer+1, value);
    }

    public static void main(String args[]){
        int[] inputArray = new int[]{1,2,3,4,5};
        int value = 6;
        int pointer = 0;
        System.out.println(recursiveLinearSearch(inputArray, pointer, value));
    }
}
