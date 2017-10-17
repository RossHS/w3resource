package w3resource.dataTypes;

import java.util.Scanner;

/**
 * Created by Ross on 17.10.2017.
 */
public class Ex2 {
    private static final double INCH = 0.0254;

    private static double toMeters(double inch){
        return inch*INCH;
    }

    public static void main(String[] args) {
        double inch =0;
        System.out.println("Input inch to convert: ");
        try (Scanner scanner = new Scanner(System.in)){

            if(scanner.hasNextDouble()) inch = scanner.nextDouble();

        }
        System.out.print("Meters: " + toMeters(inch));

    }
}