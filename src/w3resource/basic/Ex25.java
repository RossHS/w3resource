package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 08.10.2017.
 */
public class Ex25 {
    public static void main(String[] args) {
        int octNum, decNum = 0, quot, j = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Octal Number : ");
        octNum = scan.nextInt();

        while (octNum != 0) {
            quot = octNum % 10;
            decNum += quot * j;
            j *= 8;
            octNum /= 10;
        }

        System.out.print("Decimal number is: " + decNum);
    }
}
