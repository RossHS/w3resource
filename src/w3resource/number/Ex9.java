package w3resource.number;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 05.01.2018
 */
public class Ex9 {
    public static void main(String[] args) {
        System.out.print("Happy numbers: ");
        for (int num = 1, count = 0; count < 8; num++) {
            if (happyNum(num)) {
                System.out.print(num + ", ");
                count++;
            }
        }
    }

    public static boolean happyNum(int num) {
        Set<Integer> set = new HashSet<>();
        int counter = 0;
        while (num != 1 && set.add(num)) {
            int digit = 0;
            while (num > 0) {
                int temp = num % 10;
                digit += temp * temp;
                num /= 10;
            }
            num = digit;
            counter++;
        }
        if (num == 1) System.out.print("counter " + counter + " ");
        return num == 1;
    }
}
