package w3resource.dataTypes;

import java.util.Scanner;

/**
 * Created by Ross on 21.10.2017.
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum;
        System.out.println("Введите число для нахождения суммы его цифр");
        while (scanner.hasNextInt()) {
            sum = 0;
            num = scanner.nextInt();
            if (num >= 0 && num <= 1000) {
                while (num % 10 != 0) {
                    sum += num % 10;
                    num /= 10;
                }
                System.out.println("Сумма " + sum);
            } else break;
        }
        System.out.println("КОНЕЦ");
    }
}
