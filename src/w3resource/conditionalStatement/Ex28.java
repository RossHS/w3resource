package w3resource.conditionalStatement;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 12.11.2017
 */
public class Ex28 {
    static String testAFlot(double num) {
        String str = "";
        if (num == 0) return "Zero";
        if (num < 1) str += "small ";
        if (num > 1_000_000) str += "large ";
        if(num>0) str += "positive";
        else str+="negative";
        return str;
    }

    public static void main(String[] args) {
        System.out.println(testAFlot(100000000));
    }
}
