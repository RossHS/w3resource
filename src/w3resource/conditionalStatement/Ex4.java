package w3resource.conditionalStatement;

import java.util.Scanner;

/**
 * Created by Ross on 05.11.2017.
 */
public class Ex4 {
    private static String test(float num) {
        String str = "";
        if (num == 0) {
            return "Zero";
        }
        if (num < 1) str += "small ";
        if (num > 1_000_000) str += "large ";
        str += num >= 0 ? "positive" : "negative";
        return str;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float num = sc.nextFloat();
            System.out.println(test(num));
        }
    }
}
