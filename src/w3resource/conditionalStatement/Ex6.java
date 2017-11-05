package w3resource.conditionalStatement;

import java.util.Scanner;

/**
 * Created by Ross on 05.11.2017.
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        float x = in.nextFloat();
        System.out.print("Input floating-point another number: ");
        float y = in.nextFloat();

        x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }
    }
}
