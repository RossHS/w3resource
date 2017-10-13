package w3resource.basic;

import java.util.Arrays;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex95 {
    static int[] newArr(int size) {
        int[] numArr = new int[size];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
        }
        return numArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(newArr(10)));
    }
}
