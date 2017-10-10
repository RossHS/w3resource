package w3resource.basic;

/**
 * Created by Ross on 10.10.2017.
 */
public class Ex52 {
    public static boolean weird(int num1, int num2, int num3) {
        return (num1 + num2) == num3;
    }

    public static void main(String[] args) {
        System.out.println(weird(1, 2, 3));
    }
}
