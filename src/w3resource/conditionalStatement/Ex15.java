package w3resource.conditionalStatement;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 08.11.2017
 */
public class Ex15 {
    public static void showOdd(int num) {
        int[] odd = new int[num];
        int sum = 0;

        for (int i = 0, counter = 0; counter != num; i++) {
            if (i % 2 != 0) {
                odd[counter] = i;
                counter++;
                sum += i;
            }
        }
        System.out.println(Arrays.toString(odd));
        System.out.println("Сумма " + num + " первых нечетных чисел равна = " + sum);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Ex15.showOdd(sc.nextInt());
        }
    }
}
