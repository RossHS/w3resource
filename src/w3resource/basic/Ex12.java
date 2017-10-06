package w3resource.basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ross on 05.10.2017.
 */
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> massive = new ArrayList<>();


        String d;
        double num;
        double result = 0;

        System.out.println("Введите числа. Для остановки введите stop");
        while (true) {
            d = scanner.next();
            if (d.equals("stop")) {
                break;
            }
            num = (double) Integer.parseInt(d);
            massive.add(num);
        }

        for (Double aMassive : massive) {
            result += aMassive;
        }

        result /= massive.size();

        System.out.println(result);
    }
}
