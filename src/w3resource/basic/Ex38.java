package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 09.10.2017.
 */
public class Ex38 {
    public static void main(String[] args) {
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст для проверки: ");
        String text = scanner.nextLine();
        char[] ch = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                number++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                other++;
            }
        }

        System.out.println("String is: " + text);
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.println("other: " + other);
    }
}
