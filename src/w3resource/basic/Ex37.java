package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 09.10.2017.
 */
public class Ex37 {
    public static void reverse(String text) {
        StringBuffer reverseText = new StringBuffer();
        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText.append(text.charAt(i));
        }
        System.out.println(reverseText);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        reverse(text);
    }
}
