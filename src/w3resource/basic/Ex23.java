package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 07.10.2017.
 */
public class Ex23 {
    public static void main(String[] args) {
        int binNum, decNum = 0, quot, j = 1, rem;
        String hexNum = "";
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Binary Number : ");
        binNum = scan.nextInt();

        while (binNum != 0) {
            quot = binNum % 10;
            decNum += quot * j;
            j *= 2;
            binNum /= 10;
        }
        while (decNum > 0) {
            rem = decNum % 16;
            hexNum = hex[rem] + hexNum;
            decNum /= 16;
        }

        System.out.print("Hex number is: " + hexNum);
    }
}
