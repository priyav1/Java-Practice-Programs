package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by priya on 20/08/18.
 */
public class PlusOne {
    public static int[] plusOne(int[] digits){
        //this method fails if the input array is too large.
        int num = 0;
        for(int i=0;i<digits.length;i++){
            num = (digits[i] + num) * 10;
        }
        System.out.println(num);
        num = (num/10)+1;
        ArrayList<Integer> newList = new ArrayList<>();
        while(num>0){
            newList.add(num%10);
            num/=10;
        }
        int[] newArray = new int[newList.size()];
        for(int i=newList.size()-1;i>=0;i--){
            newArray[newArray.length-1-i] = newList.get(i);
        }
        return newArray;
    }

    public static int[] altMethod(int[] digits){
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{8,9,9,9};
        digits = altMethod(digits);
        for(int a: digits){
            System.out.print(a + " ");
        }
    }
}
