package w3resource.basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ross on 08.10.2017.
 */
public class Ex26 {
    public static void main(String[] args) {
        int octNum, decNum = 0, quot, j = 1;
        Scanner scan = new Scanner(System.in);
        ArrayList binNum = new ArrayList();

        System.out.print("Input a Octal Number : ");
        octNum = scan.nextInt();

        while (octNum != 0) {
            quot = octNum % 10;
            decNum += quot * j;
            j *= 8;
            octNum /= 10;
        }

        while (decNum != 0) {
            binNum.add(decNum % 2);
            decNum /= 2;
        }
        System.out.print("Binary number is: ");
        for (int i = binNum.size() - 1; i >= 0; i--) {
            System.out.print(binNum.get(i));
        }
    }
}
