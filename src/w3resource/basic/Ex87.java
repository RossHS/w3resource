package w3resource.basic;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex87 {
    static boolean check(int num1, int num2) {
        return (num1 > 50 && num2 > 50 && num1 < 100 && num2 < 100);
    }

    public static void main(String[] args) {
        System.out.println(check(50, 100));
    }
}
