package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 11.10.2017.
 */
public class Ex62 {public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    System.out.print("Input the first number : ");
    int x = in.nextInt();
    System.out.print("Input the second number: ");
    int y = in.nextInt();
    System.out.print("Input the third number : ");
    int z = in.nextInt();
    System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
}
}