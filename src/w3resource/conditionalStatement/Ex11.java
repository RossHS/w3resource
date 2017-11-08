package w3resource.conditionalStatement;

import java.util.Scanner;

/**
 * created on 07.11.2017
 *
 * @author Ross Khapilov
 * @version 1.0
 */
public class Ex11 {
    public static void main(String[] args) {
        int naturalNumber = 0;
        int sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while (!(naturalNumber >= 1)) {
                if (sc.hasNextInt()) {
                    naturalNumber = sc.nextInt();
                    if (naturalNumber < 1)
                        System.out.println("Вы ввели некорректное число. Требуется натуральное число");
                }
            }
        }
        System.out.print("Натуральные числа: ");
        for (int i = 1; i <= naturalNumber; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.print("\nИх сумма = " + sum);
    }
}
