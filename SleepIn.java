/**
 * Created by priya on 15/06/17.
 */
public class SleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation){
        if(weekday==false || vacation==true){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(sleepIn(false,false));
    }
}
