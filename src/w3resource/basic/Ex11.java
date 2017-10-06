package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 05.10.2017.
 */
public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rad = scanner.nextDouble();
        double area = Math.PI * rad * rad;
        double perimeter = 2 * Math.PI * rad;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
