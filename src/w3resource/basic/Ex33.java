package w3resource.basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ross on 08.10.2017.
 */
public class Ex33 {
    public static int sumDigits(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для нахождения суммы его цифр: ");
        num = scanner.nextInt();
        System.out.println("Сумма цифр = " + sumDigits(num));
    }
}
