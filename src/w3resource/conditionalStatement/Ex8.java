package w3resource.conditionalStatement;

import java.util.Scanner;

/**
 * Created by Ross on 07.11.2017.
 */
public class Ex8 {
    public static void main(String[] args) {
        String str = "";
        char ch;
        try (Scanner sc = new Scanner(System.in)) {
            if (sc.hasNext())
                str = sc.next().toLowerCase();
        }
        ch = str.charAt(0);
        if (str.length() == 1 && Character.isAlphabetic(ch)) {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is vowel");
                    break;
                default:
                    System.out.println(ch + " is consonant");
            }
        } else System.out.println("Error! " + str.length() + " not equals 1 or is not a Alphabet");
    }
}
