package com.priya.algorithms;

/**
 * Created by priya on 07/08/18.
 * O(n2)
 */
public class SelectionSort {
    public static void main(String args[]){
        int[] result = selectionSort(new int[]{5,4,3,2,1});
        for(int a: result){
            System.out.print(a + " ");
        }
    }

    public static int[] selectionSort(int[] inputArray){
        for(int i=0;i<inputArray.length-1;i++){
            int pointer = i;
            for(int j=i+1;j<inputArray.length;j++){
                if(inputArray[j]<inputArray[pointer]){
                    pointer=j;
                }
            }
            int temp = inputArray[i];
            inputArray[i] = inputArray[pointer];
            inputArray[pointer] = temp;
        }

        return inputArray;
    }
}
