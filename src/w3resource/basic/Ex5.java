package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 05.10.2017.
 */
public class Ex5 {
    public static int numb(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа для умножения");
        System.out.println(numb(scanner.nextInt(), scanner.nextInt()));
    }
}
