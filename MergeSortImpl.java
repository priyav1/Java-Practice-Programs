package com.priya.algorithms;

/**
 * Created by priya on 08/08/18.
 */
public class MergeSortImpl {
    public static void main(String args[]){
        int[] inputArray = new int[]{5,4,3,2,1};
        MergeSort sorter = new MergeSort();
        sorter.sort(inputArray);
        for(int i=0;i<inputArray.length;i++){
            System.out.print(inputArray[i] + " ");
        }
    }
}
