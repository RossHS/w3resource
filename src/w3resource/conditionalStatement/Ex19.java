package w3resource.conditionalStatement;

import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 09.11.2017
 */
public class Ex19 {
    public static void main(String[] args) {
        int rows = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt())
                rows = scanner.nextInt();
        }
        for (int i = 1, spacer = rows; i <= rows; i++) {
            for (int j = 0; j < spacer; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            spacer--;
            System.out.println();
        }

    }
}
