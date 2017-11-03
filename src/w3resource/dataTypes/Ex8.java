package w3resource.dataTypes;

import java.util.Scanner;

/**
 * Created by Ross on 03.11.2017.
 */
public class Ex8 {
    private static void power(double a) {
        System.out.println("Квадрат числа " + a + " = " + Math.pow(a, 2));
        System.out.println("Куб числа " + a + " = " + Math.pow(a, 3));
        System.out.println("4 степень числа " + a + " = " + Math.pow(a, 4));
    }

    public static void main(String[] args) {
        System.out.println("Введите число для обработки: ");
        try (Scanner sc = new Scanner(System.in)) {
            double d = sc.nextDouble();
            power(d);
        }
    }
}
