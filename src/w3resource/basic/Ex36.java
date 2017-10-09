package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 09.10.2017.
 */
public class Ex36 {
    public static double distance(double x1, double y1, double x2, double y2) {
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        double r = 6371.01;
        return r * Math.acos(Math.sin(x1) * Math.sin(x2) +
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the latitude of coordinate 1");
        int x1 = scanner.nextInt();
        System.out.println("Input the longitude of coordinate 1");
        int y1 = scanner.nextInt();
        System.out.println("Input the latitude of coordinate 2");
        int x2 = scanner.nextInt();
        System.out.println("Input the longitude of coordinate 2");
        int y2 = scanner.nextInt();

        System.out.println("The distance between those points is: " + distance(x1, y1, x2, y2));
    }
}
