package w3resource.conditionalStatement;

import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 13.11.2017
 */
public class Ex32 {
    public static void main(String[] args) {
        double a;
        double b;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите первое число для проверки");
            a = scanner.nextDouble();
            System.out.println("Введите второе число для проверки");
            b = scanner.nextDouble();
        }

        if (Double.compare(a, b) == 0) System.out.println("Они равны");
        else System.out.println("Не равны");
    }
}
