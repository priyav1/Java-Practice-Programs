package leetcode;

/**
 * Created by priya on 20/08/18.
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 */
public class MaximumSubarray {
    public static int getMaximumSum(int[] inputArray){
        int maxSum = Integer.MIN_VALUE;
        int tempSum = 0;
        int largestNegativeNumber=Integer.MIN_VALUE;
        for(int i=0;i<inputArray.length;i++){
            tempSum+=inputArray[i];
            if(inputArray[i] > largestNegativeNumber){
                largestNegativeNumber = inputArray[i];
            }
            if(tempSum<0){
                tempSum=0;
            }
            if(tempSum>maxSum){
                maxSum=tempSum;
            }
        }
        return maxSum>0?maxSum:largestNegativeNumber;
    }

    public static void main(String[] args) {
        System.out.println(getMaximumSum(new int[]{-3,-2,-2,-3}));
    }
}
