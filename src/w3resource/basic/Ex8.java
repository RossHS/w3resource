package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 05.10.2017.
 */
public class Ex8 {
    static String[][] nums = {
            {"  ***  ", "   *   ", "  ***  ", "  ***  ", "    *  ", " ***** ", "  ***  ", " ***** ", "  ***  ", "  ***  "},
            {" *   * ", "  **   ", " *   * ", " *   * ", "   **  ", " *     ", " *   * ", "     * ", " *   * ", " *   * "},
            {"*     *", " * *   ", " *   * ", "     * ", "  * *  ", " *     ", " *     ", "    *  ", " *   * ", " *   * "},
            {"*     *", "   *   ", "    *  ", "  ***  ", " *  *  ", " ****  ", " ****  ", "   *   ", "  ***  ", "  ***  "},
            {"*     *", "   *   ", "   *   ", "     * ", " ***** ", "     * ", " *   * ", "  *    ", " *   * ", "     * "},
            {" *   * ", "   *   ", "  *    ", " *   * ", "    *  ", " *   * ", " *   * ", "  *    ", " *   * ", "     * "},
            {"  ***  ", " ***** ", " ***** ", "  ***  ", "    *  ", "  ***  ", "  ***  ", "  *    ", "  ***  ", "  ***  "}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число");
        int x = scanner.nextInt();

        int[] digits = numberToArray(x);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < digits.length; j++) {
                System.out.print(nums[i][digits[j]]);
            }
            System.out.println();
        }
    }

    private static int[] numberToArray(int x) {
        char[] array1 = Integer.toString(x).toCharArray();
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = Character.getNumericValue(array1[i]);
        }
        return array2;
    }
}
