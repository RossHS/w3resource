package w3resource.conditionalStatement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * created on 07.11.2017
 *
 * @author Ross Khapilov
 * @version 1.0
 */
public class Ex12 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int sum = 0;
        double average = 0;
        System.out.println("Для остановки введите любое не число");
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                nums.add(sc.nextInt());
            }
        }
        for (Integer num : nums) {
            sum += num;
        }
        average = sum / nums.size();
        System.out.println("Сумма = " + sum);
        System.out.println("Среднее число = " + average);
    }
}
