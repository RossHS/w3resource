package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 08.10.2017.
 */
public class Ex34 {
    public static double areaOfHexagon(int s) {
        return (s * s * 6) / (4 * Math.tan(Math.PI / 6));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(areaOfHexagon(scanner.nextInt()));
    }
}
