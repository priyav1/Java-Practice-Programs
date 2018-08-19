package com.priya.algorithms;

/**
 * Created by priya on 07/08/18.
 * O(n2)
 */
public class InsertionSort {
    public static void main(String args[]){
        int[] result = insertionSort(new int[]{5,4,3,2,1});
        for(int a: result){
            System.out.print(a + " ");
        }
    }

    public static int[] insertionSort(int[] inputArray){
        for(int i=1;i<inputArray.length;i++){
            int j = i-1;
            int element = inputArray[i];
            while(j>=0 && inputArray[j] > element){
                inputArray[j+1] = inputArray[j];
                j--;
            }
            inputArray[j+1] = element;
        }
        return inputArray;
    }
}
