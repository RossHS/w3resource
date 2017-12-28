package w3resource.methods;

import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 28.12.2017
 */
public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of sides: ");
        int n = input.nextInt();
        input.close();
        System.out.print("Input the side: ");
        double side = input.nextDouble();

        System.out.println("The area of the pentagon is " + pentagon_area(n, side));
    }

    public static double pentagon_area(int n, double s) {
        return (n * s * s) / (4 * Math.tan(Math.PI / n));
    }
}
