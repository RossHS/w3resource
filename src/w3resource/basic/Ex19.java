package w3resource.basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ross on 06.10.2017.
 */
public class Ex19 {
    public static void main(String[] args) {
        int dec_num, quot;
        ArrayList binNum = new ArrayList();
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Decimal Number : ");
        dec_num = scan.nextInt();

        quot = dec_num;
        while (quot != 0) {
            binNum.add(quot % 2);
            quot = quot / 2;
        }

        System.out.print("Binary number is: ");
        System.out.println();
        for (int k = binNum.size() - 1; k >= 0; k--) {
            System.out.print(binNum.get(k));
        }
    }
}
