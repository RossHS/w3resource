package w3resource.basic;

import java.util.Arrays;

/**
 * Created by Ross on 15.10.2017.
 */
public class Ex114 {
    public static void main(String[] args) {
        String str = "abcdefg";
        char[] A = str.toCharArray();
        int offset=3;
        int len = A.length;
        offset %= len;
        reverse(A, 0, len - offset - 1);
        reverse(A, len - offset, len - 1);
        reverse(A, 0, len - 1);
        System.out.println("\n"+ Arrays.toString(A));
    }

    private static void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }

    }
}
