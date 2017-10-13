package w3resource.basic;

import java.util.Arrays;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex103 {
    public static void main(String[] args) {
        int[] num = {1, 29, 10, 35, 10, 30, 20};
        int temp = num.length - 1;
        int[] newNum;

        while (num[temp] != 10) {
            temp--;
        }

        newNum = new int[num.length - temp - 1];
        for (int j = 0; j < newNum.length; j++, temp++) {
            newNum[j] = num[temp + 1];
        }
        System.out.println(Arrays.toString(newNum));
    }
}

