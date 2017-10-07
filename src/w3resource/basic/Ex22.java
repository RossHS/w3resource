package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 07.10.2017.
 */
public class Ex22 {
    public static void main(String[] args) {
        int binNum, decNum = 0, quot, j = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Binary Number : ");
        binNum = scan.nextInt();

        while (binNum != 0) {
            quot = binNum % 10;
            decNum += quot * j;
            j *= 2;
            binNum /= 10;
        }

        System.out.print("Decimal number is: " + decNum);
    }
}
