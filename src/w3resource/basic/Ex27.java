package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 08.10.2017.
 */
public class Ex27 {
    public static void main(String[] args) {
        int octNum, decNum = 0, quot, rem, j = 1;
        String hexNum = "";
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Octal Number : ");
        octNum = scan.nextInt();

        while (octNum != 0) {
            quot = octNum % 10;
            decNum += quot * j;
            j *= 8;
            octNum /= 10;
        }
        while (decNum > 0) {
            rem = decNum % 16;
            hexNum = hex[rem] + hexNum;
            decNum /= 16;
        }

        System.out.print("Hex number is: " + hexNum);
    }
}
