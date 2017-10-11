package w3resource.basic;

/**
 * Created by Ross on 11.10.2017.
 */
public class Ex64 {
    static boolean between(int num1, int num2) {
        return (num1 > 25 && num2 < 75 && num2 > 25 && num2 < 75);
    }

    public static void main(String[] args) {
        System.out.println(between(40, 59));
    }
}
