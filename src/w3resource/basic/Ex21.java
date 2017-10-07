package w3resource.basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ross on 07.10.2017.
 */
public class Ex21 {
    public static void main(String[] args) {
        int decNum;
        ArrayList<Integer> octNum = new ArrayList();
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Decimal Number : ");
        decNum = scan.nextInt();


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
