package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by priya on 19/08/18.
 * Given a string, find the length of the longest substring without repeating characters.
 * Input: "pwwkew"
 Output: 3
 Explanation: The answer is "wke", with the length of 3.
 Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstring {
    public static void main(String args[]){
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        int ans = 0;
        int length = s.length();
        Set<Character> set = new HashSet<>();
        while(j < length && i < length){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j-i);
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
