package w3resource.basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ross on 08.10.2017.
 */
public class Ex29 {
    public static ArrayList<Integer> decToBin(int decNum){
        ArrayList<Integer> binNum = new ArrayList<Integer>();
        while (decNum != 0) {
            binNum.add(decNum % 2);
            decNum /= 2;
        }
        return binNum;
    }
    public static void main(String[] args) {
        String hexdec_num;
        int dec_num;
        ArrayList<Integer> binNum = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a hexadecimal number: ");
        hexdec_num = scan.nextLine();

        dec_num = Ex28.hex_to_decimal(hexdec_num);

        System.out.print("Equivalent Binary number is: ");

        binNum = decToBin(dec_num);
        for (int i = binNum.size()-1; i >= 0 ; i--) {
            System.out.print(binNum.get(i));
        }
    }
}
