package com.priya.algorithms;

/**
 * Created by priya on 07/08/18.
 */
public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] inputArray, int start, int end, int value){
        if(start>end){
            return -1;
        }
        int mid = (start+end)/2;
        if(inputArray[mid]>value){
            return recursiveBinarySearch(inputArray, start,mid-1,value);
        }
        else if(inputArray[mid]<value){
            return recursiveBinarySearch(inputArray,mid+1,end,value);
        }
        return mid;
    }

    public static void main(String args[]){
        int[] inputArray = new int[]{1,2,3,4,5};
        int value = 1;
        System.out.println(recursiveBinarySearch(inputArray, 0,inputArray.length-1, value));
    }
}
