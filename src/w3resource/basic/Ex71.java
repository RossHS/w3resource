package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 11.10.2017.
 */
public class Ex71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();
        String str3 = str1.substring(1)+str2.substring(1);
        System.out.println(str3);
    }
}
