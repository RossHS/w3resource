package w3resource.basic;

/**
 * Created by Ross on 10.10.2017.
 */
public class Ex53 {
    public static boolean weird(int num1, int num2, int num3) {
        return num3 > num2 && num2 > num1;
    }

    public static void main(String[] args) {
        System.out.println(weird(5, 7, 8));
    }
}
