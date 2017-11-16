package w3resource.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 16.11.2017
 */
public class Ex5 {
    public static boolean containsOf(int[] array, int val) {
        for (int a : array) {
            if (val == a) return true;
        }
        return false;
    }

    public static boolean containsOf(String[] array, String val) {
        for (String a : array) {
            if (a.equals(val)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] strArray = {"ABC", "Lyona", "Moscow"};
        System.out.println("Введите число для проверки, содержится ли оно в массиве: " + Arrays.toString(testArray));
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) System.out.println(containsOf(testArray, sc.nextInt()));
        }
        System.out.println(containsOf(strArray, "ABC"));
    }
}
