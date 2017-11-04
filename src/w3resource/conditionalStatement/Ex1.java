package w3resource.conditionalStatement;

/**
 * Created by Ross on 04.11.2017.
 */
public class Ex1 {

    private static boolean isPositive(int num) {
        return num >= 0;
    }

    public static void main(String[] args) {
        System.out.println(isPositive(10));
        System.out.println(isPositive(-1));
        System.out.println(isPositive(0));
    }
}
