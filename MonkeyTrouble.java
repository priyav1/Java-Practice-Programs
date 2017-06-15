/**
 * Created by priya on 15/06/17.
 */
public class MonkeyTrouble {
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (!(aSmile^bSmile));
    }

    public static void main(String[] args) {
        System.out.println(monkeyTrouble(false,false));
    }
}
