package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 09.10.2017.
 */
public class Ex35 {
    public static double areaOfPolygon(int n, int s) {
        return (n * s * s) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        int sidesNum;
        int lengthOfSide;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of sides on the polygon: ");
        sidesNum = scanner.nextInt();
        System.out.print("Input the length of one of the sides: ");
        lengthOfSide = scanner.nextInt();

        System.out.println("The area is: " + areaOfPolygon(sidesNum, lengthOfSide));
    }
}
