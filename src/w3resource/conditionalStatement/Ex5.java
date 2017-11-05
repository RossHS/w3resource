package w3resource.conditionalStatement;

import java.time.DayOfWeek;
import java.util.Scanner;

/**
 * Created by Ross on 05.11.2017.
 */
public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Введите день недели");
        try (Scanner sc = new Scanner(System.in)) {
            int day;
            do {
                day = sc.nextInt();
            }
            while (!(day > 0 && day < 8));
            DayOfWeek d = DayOfWeek.of(day);
            System.out.println(d);
        }
    }
}
