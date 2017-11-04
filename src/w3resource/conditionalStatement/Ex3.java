package w3resource.conditionalStatement;

import java.util.Arrays;

/**
 * Created by Ross on 04.11.2017.
 */
public class Ex3 {
    static int getGreatest(int... num) {
        Arrays.sort(num);
        return num[0];
    }

    public static void main(String[] args) {
        System.out.println(getGreatest(17, 9, 12, 33, 10));
    }
}
