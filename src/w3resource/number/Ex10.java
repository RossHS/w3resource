package w3resource.number;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 05.01.2018
 */
public class Ex10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                if (!isHappyNum(i)) System.out.println(i + " unhappy");
                else System.out.println(i + " happy");
            }
        }
    }

    public static boolean isHappyNum(int num) {
        Set<Integer> set = new HashSet<>();
        while (num != 1 && set.add(num)) {
            int digit = 0;
            while (num > 0) {
                int temp = num % 10;
                digit += temp * temp;
                num /= 10;
            }
            num = digit;
        }
        return num == 1;
    }
}
