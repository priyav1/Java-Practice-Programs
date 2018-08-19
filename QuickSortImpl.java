package com.priya.algorithms;

/**
 * Created by priya on 09/08/18.
 */
public class QuickSortImpl {
    public static void main(String args[]){
        int[] inputArray = {5,4,3,2,1};
        QuickSort sorter = new QuickSort();
        sorter.quickSort(inputArray, 0, inputArray.length-1);
        for(int i: inputArray){
            System.out.print(i+ " ");
        }
    }
}
