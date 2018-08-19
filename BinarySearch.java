package com.priya.algorithms;

/**
 * Created by priya on 07/08/18.
 * log n
 */
public class BinarySearch {
    public static int binarySearch(int value, int[] inputArray){
        int start = 0;
        int end = inputArray.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(inputArray[mid] == value){
                return mid;
            }
            else if(inputArray[mid] > value){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] inputArray = new int[]{1,2,3,4,5};
        int value = 6;
        System.out.println(binarySearch(value,inputArray));
    }
}
