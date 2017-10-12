package w3resource.basic;

import java.util.Arrays;

/**
 * Created by Ross on 12.10.2017.
 */
public class Ex79 {
    static int[] newArr(int[] arr) {
        int[] newArr = new int[arr.length];
        int temp = 1;
        for (int i = 0; i < arr.length; i++) {
            newArr[temp] = arr[i];
            temp++;
            if (temp == arr.length) {
                temp = 0;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = newArr(arr1);
        System.out.println(Arrays.toString(arr2));
    }
}
