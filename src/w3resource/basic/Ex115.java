package w3resource.basic;

import java.util.Scanner;

/**
 * Created by Ross on 15.10.2017.
 */
public class Ex115 {
    public static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число на проверку");
        int numToCheck = sc.nextInt();
        sc.close();
        if (isPalindrome(numToCheck)) System.out.println(numToCheck + " полиндром");
        else System.out.println(numToCheck + " не полиндром");
    }
}
