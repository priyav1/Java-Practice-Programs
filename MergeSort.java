package com.priya.algorithms;

/**
 * Created by priya on 08/08/18.
 * O(nlogn)
 */
public class MergeSort {
    public static void sort(int[] inputArray){
        sort(inputArray,0,inputArray.length-1);
    }

    public static void sort(int[] inputArray, int start, int end){
        if(start >= end){
            return;
        }

        int mid = (start+end)/2;
        sort(inputArray, start, mid);
        sort(inputArray, mid+1, end);
        merge(inputArray, start, mid, end);
    }

    public static void merge(int[] inputArray, int start, int mid, int end){
        int[] tempArray = new int[end-start+1];
        int leftSlot = start;
        int rightSlot = mid+1;
        int k =0;
        while(leftSlot<=mid && rightSlot<=end){
            if(inputArray[leftSlot]<inputArray[rightSlot]){
                tempArray[k] = inputArray[leftSlot];
                leftSlot+=1;
            }
            else{
                tempArray[k] = inputArray[rightSlot];
                rightSlot+=1;
            }
            k++;
        }
        if(leftSlot<=mid){
            while(leftSlot<=mid){
                tempArray[k++]=inputArray[leftSlot++];
            }
        }
        if(rightSlot<=end){
            while(rightSlot<=end){
                tempArray[k++]=inputArray[rightSlot++];
            }
        }
        for(int i=0;i<tempArray.length;i++){
            inputArray[start+i] = tempArray[i];
        }
    }

    private static int[] tempArray;
    public static void mergeInPlace(int inputArray[], int start, int mid, int end){
        int i = start;
        int j = mid+1;

        for(int k=0;k<=end;k++){
            tempArray[k]=inputArray[k];
        }

        for(int k=start;k<=end;k++){
            if(i>mid){
                inputArray[k]=tempArray[j++];
            }
            else if(j>end){
                inputArray[k]=tempArray[i++];
            }
            else if(tempArray[j] < tempArray[i]){
                inputArray[k]=tempArray[j++];
            }
            else{
                inputArray[k]=tempArray[i++];
            }
        }
    }
}
