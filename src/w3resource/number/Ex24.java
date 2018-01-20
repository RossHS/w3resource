package w3resource.number;

import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 20.01.2018
 */
public class Ex24 {
    public static <T> boolean isPalindrome(T test) {
        String str = String.valueOf(test);
        for (int i = 0, j = str.length() - 1; i < str.length()/2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                System.out.println(isPalindrome(scanner.next()) ? "is palindrome" : "not");
            }
        }
    }
}
