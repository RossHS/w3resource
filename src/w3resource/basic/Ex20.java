package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 07.10.2017.
 */
public class Ex20 {
    public static void main(String[] args) {
        int decNum, rem;
        String hexNum = "";
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите число для его преобразование в 16 систему счистления");
        decNum = scanner.nextInt();
        while (decNum > 0) {
            rem = decNum % 16;
            hexNum = hex[rem] + hexNum;
            decNum /= 16;
        }
        System.out.println(hexNum);
    }
}
