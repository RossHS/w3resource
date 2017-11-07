package w3resource.conditionalStatement;

import java.util.Scanner;

/**
 * Created by Ross on 07.11.2017.
 */
public class Ex9 {
    public static void main(String[] args) {
        int year = 0;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input the year: ");
            if (in.hasNext())
                year = in.nextInt();
        }

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
