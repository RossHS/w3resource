package w3resource.basic;

import java.util.Arrays;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex104 {
    public static void main(String[] args) {
        int[] num = {1, 29, 10, 35, 10, 30, 20};
        int temp = num.length - 1;
        int[] newNum;

        while (num[temp] != 10) {
            temp--;
        }

        newNum = new int[temp];
        for (int j = 0; j < newNum.length; j++) {
            newNum[j] = num[j];
        }
        System.out.println(Arrays.toString(newNum));
    }
}
