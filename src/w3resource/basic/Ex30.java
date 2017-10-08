package w3resource.basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ross on 08.10.2017.
 */
public class Ex30 {
    public static ArrayList<Integer> decToOctal(int decNum) {
        ArrayList<Integer> octNum = new ArrayList<Integer>();
        while (decNum != 0) {
            octNum.add(decNum % 8);
            decNum /= 8;
        }
        return octNum;
    }

    public static void main(String[] args) {
        String hexdec_num;
        int dec_num;
        ArrayList octNum = new ArrayList();
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a hexadecimal number: ");
        hexdec_num = scan.nextLine();

        dec_num = Ex28.hex_to_decimal(hexdec_num);
        octNum = decToOctal(dec_num);
        System.out.print("Equivalent octal number is: ");
        for (int i = octNum.size()-1; i >= 0; i--) {
            System.out.print(octNum.get(i));
        }
    }
}
