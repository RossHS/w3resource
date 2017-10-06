package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 05.10.2017.
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для таблицы умножение и ее размер");
        int num = scanner.nextInt();
        int range = scanner.nextInt();
        multiplicationTable(num, range);
    }

    public static void multiplicationTable(int num, int range) {
        for (int i = 1; i <= range; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
