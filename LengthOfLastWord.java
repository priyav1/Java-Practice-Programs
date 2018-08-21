package leetcode;

/**
 * Created by priya on 20/08/18.
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s){
        String[] inputArray = s.split(" ");
        if(inputArray.length<=0){
            return 0;
        }
        return inputArray[inputArray.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" "));
    }
}
