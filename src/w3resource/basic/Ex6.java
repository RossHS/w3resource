package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 05.10.2017.
 */
public class Ex6 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int addition(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sum(a, b));
        System.out.println(addition(a, b));
        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));
        System.out.println(mod(a, b));
    }

}
