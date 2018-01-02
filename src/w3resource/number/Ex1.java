package w3resource.number;

import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 29.12.2017
 */
public class Ex1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num <= 0) System.out.println("Ugly");
                if (num % 5 == 0 || num % 3 == 0 || num % 2 == 0) System.out.println("valid");
                else System.out.println("ugly");
            }
        }
    }
}
