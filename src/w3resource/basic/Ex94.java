package w3resource.basic;

import java.util.Arrays;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex94 {
    public static void sortB(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length - 1; j++) {
                if (num[j] % 2 == 0 && num[j + 1] % 2 != 0) {
                    int temp;
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {1, 23, 2, 12, 5, 11, 4, 6, 13, 8, 10, 3};
        sortB(num);
        System.out.println(Arrays.toString(num));
    }
}
