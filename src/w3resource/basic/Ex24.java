package w3resource.basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ross on 07.10.2017.
 */
public class Ex24 {
    public static void main(String[] args) {
        int binNum, decNum = 0, quot, j = 1;
        ArrayList<Integer> octNum = new ArrayList();

        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Binary Number : ");
        binNum = scan.nextInt();

        while (binNum != 0) {
            quot = binNum % 10;
            decNum += quot * j;
            j *= 2;
            binNum /= 10;
        }
        while (decNum != 0) {
            octNum.add(decNum % 8);
            decNum /= 8;
        }

        System.out.print("Octal number is: ");
        for (int k = octNum.size() - 1; k >= 0; k--) {
            System.out.print(octNum.get(k));
        }


    }
}
