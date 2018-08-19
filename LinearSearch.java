package com.priya.algorithms;

/**
 * Created by priya on 07/08/18.
 * O(n)
 */
public class LinearSearch {
    public static int linearSearch(int[] inputArray, int value){
        int location = -1;
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]==value){
                return i;
            }
        }
        return location;
    }
}
