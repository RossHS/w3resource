package w3resource.number;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 09.01.2018
 */
public class Ex15 {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = (str) -> !str.startsWith("0") && str.contains("0");
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                String str = scanner.nextLine();
                System.out.println(stringPredicate.test(str));
                System.out.println(var2(str));
                System.out.println(regEx(str));
            }
        }
    }

    static boolean var2(String str) {
        if (str.charAt(0) == '0' || str.length() == 1) return false;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == '0') return true;
        }
        return false;
    }

    static boolean regEx(String str) {
        Pattern pattern = Pattern.compile("[^0]((?=.*[0])(?=.*[0-9])).+");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
