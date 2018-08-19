package com.priya.algorithms;

/**
 * Created by priya on 09/08/18.
 */
public class QuickSort {
    public static void quickSort(int[] inputArray, int start, int end){
        if(start<end) {

            int partitionPoint = partition(inputArray, start, end);
            quickSort(inputArray, start, partitionPoint - 1);
            quickSort(inputArray, partitionPoint + 1, end);
        }
    }

    public static int partition(int[] inputArray, int start, int end){
        int i = start-1;
        int j = start;
        int pivot = inputArray[end];

        while(j<end && i<end){
            if(inputArray[j] <= pivot){
                int temp = inputArray[++i];
                inputArray[i]=inputArray[j];
                inputArray[j]=temp;
            }
                j++;
        }
        inputArray[end] = inputArray[i+1];
        inputArray[++i]=pivot;
        return i;
    }
}
