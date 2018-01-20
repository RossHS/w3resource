package w3resource.number;

import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 20.01.2018
 */
public class Ex22 {
    public static boolean isMersenneNumber(int num) {
        int temp = 0;
        for (int counter = 1; num > temp; counter++) {
            temp = (int) Math.pow(2, counter) - 1;
            if (temp == num) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println(isMersenneNumber(i) ? i + " is Mersenne number" : i + " no, its not");
            }
        }
    }
}
