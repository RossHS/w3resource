package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex86 {
    public static void main(String[] args) {
        int num;
        try (Scanner scanner = new Scanner(System.in)) {
            num = scanner.nextInt();
        }
        System.out.println(num > 90 && num < 90);
    }
}
