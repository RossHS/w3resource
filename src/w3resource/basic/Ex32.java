package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 08.10.2017.
 */
public class Ex32 {
    public static void compare(int first, int second){
        if (first != second) {
            System.out.println(first + " != " + second);
        }
        if (first == second) {
            System.out.println(first + " == " + second);
        }
        if (first >= second) {
            System.out.println(first + " >= " + second);
        }
        if (first > second) {
            System.out.println(first + " > " + second);
        }
        if (first <= second) {
            System.out.println(first + " <= " + second);
        }
        if (first < second) {
            System.out.println(first + " < " + second);
        }
    }

    public static void main(String[] args) {
        int firstNum, secondNum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа для проверки");
        firstNum = scanner.nextInt();
        secondNum = scanner.nextInt();
        compare(firstNum,secondNum);
    }
}
