package w3resource.basic;

/**
 * Created by Ross on 11.10.2017.
 */
public class Ex65 {
    static int module(int num1, int num2) {
        int result = num1 / num2;
        return num1 - (result * num2);
    }

    public static void main(String[] args) {
        System.out.println(module(19, 7));
    }
}
