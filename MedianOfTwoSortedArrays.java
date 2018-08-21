package leetcode;

import com.sun.deploy.util.ArrayUtil;

/**
 * Created by priya on 19/08/18.
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 You may assume nums1 and nums2 cannot be both empty.
 */
public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] result = new int[nums1.length+nums2.length];
        int nIndex = 0;
        int mIndex = 0;
        int rIndex = 0;
        while(nIndex < nums1.length && mIndex < nums2.length){
            if(nums1[nIndex] <= nums2[mIndex]){
                result[rIndex++] = nums1[nIndex++];
            }
            else{
                result[rIndex++] = nums2[mIndex++];
            }
        }
        if(nIndex < nums1.length){
            while(nIndex < nums1.length) {
                result[rIndex++] = nums1[nIndex++];
            }
        }
        if(mIndex < nums2.length){
            while(mIndex < nums2.length) {
                result[rIndex++] = nums2[mIndex++];
            }
        }
        for(int k: result){
            System.out.print(k + " ");
        }
        System.out.println();
        if(result.length%2 == 0){
            return (result[result.length/2]+result[(result.length/2)-1])/2.0;
        }
        else{
            return result[result.length/2];
        }
    }

    public static void main(String args[]){
        int[] set1 = new int[]{1,2};
        int[] set2 = new int[]{3,4};

        System.out.print(findMedianSortedArrays(set1,set2));
    }
}
