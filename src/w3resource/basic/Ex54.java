package w3resource.basic;

/**
 * Created by Ross on 10.10.2017.
 */
public class Ex54 {
    public static boolean weird(int num1, int num2, int num3) {
        return (num1 % 10 == num2 % 10) || (num1 % 10 == num3 % 10) || (num2 % 10 == num3 % 10);
    }

    public static void main(String[] args) {
        System.out.println(weird(5,10,15));
    }
}
