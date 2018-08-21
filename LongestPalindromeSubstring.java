package leetcode;

/**
 * Created by priya on 20/08/18.
 */
public class LongestPalindromeSubstring {
    public static String getPalindrome2(String str){
        int n = str.length();
        int maxLength = 1;
        int start = 0;
        for(int i=1;i<n;i++){
            //for even palindrome substrings
            int low = i-1;
            int high = i;
            while(low >= 0 && high < n && str.charAt(low)==str.charAt(high)){
                if(high-low+1 > maxLength){
                    start = low;
                    maxLength = high-low+1;
                }
                low--;
                high++;
            }
            //for odd palindrome substrings
            low = i-1;
            high = i+1;
            while(low >= 0 && high < n && str.charAt(low) == str.charAt(high)){
                if(high-low+1 > maxLength){
                    start = low;
                    maxLength = high-low+1;
                }
                low--;
                high++;
            }
        }
        return str.substring(start, start+maxLength);
    }

    public static String getPalindromeSubstring(String str){
        int n = str.length();
        int longestBegin = 0;
        int maxLen = 1;
        boolean table[][] = new boolean[1000][1000];
        for(int i=0;i<n;i++){
            table[i][i] = true;
        }

        for(int i=0;i<n-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                table[i][i+1] = true;
                longestBegin = i;
                maxLen = 2;
            }
        }

        for(int len = 3; len <= n; ++len){
            for(int i=0;i<n-len+1; ++i){
                int j = i+len-1;
                if(table[i+1][j-1] && str.charAt(i)==str.charAt(j)){
                    table[i][j] = true;
                    if(len>maxLen){
                        longestBegin = i;
                        maxLen = len;
                    }
                }
            }
        }
        System.out.println(maxLen);
        return str.substring(longestBegin, longestBegin+maxLen);
    }

    public static void main(String[] args) {
        System.out.println(getPalindromeSubstring("abcababa"));
        System.out.println(getPalindrome2("abba"));
    }
}
