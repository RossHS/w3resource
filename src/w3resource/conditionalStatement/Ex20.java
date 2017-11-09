package w3resource.conditionalStatement;

import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 09.11.2017
 */
public class Ex20 {
    public static void main(String[] args) {
        int rows = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                rows = scanner.nextInt();
            }
        }
        for (int i = 1, nums = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++, nums++) {
                System.out.print(nums + " ");
            }
            System.out.println();
        }
    }
}
