package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 14.10.2017.
 */
public class Ex111 {
    public static void main(String[] arg) {
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        x = in.nextInt();
        System.out.print("Input second number: ");
        y = in.nextInt();
        in.close();
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        System.out.print("Sum: " + x);
    }
}
