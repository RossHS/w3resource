package w3resource.conditionalStatement;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 12.11.2017
 */
public class Ex27 {
    static <T extends Number> String testANum(T a) {
        if (a.doubleValue() == 0) return "Zero";
        return a.doubleValue() > 0 ? "Positive" : "Negative";
    }

    public static void main(String[] args) {
        System.out.println(testANum(-0.9));
    }
}
