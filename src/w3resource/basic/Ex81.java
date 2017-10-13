package w3resource.basic;

import java.util.Arrays;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex81 {
    static int[] swap(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 1; i < newArray.length - 1; i++) {
            newArray[i] = arr[i];
        }
        newArray[0] = arr[arr.length - 1];
        newArray[newArray.length - 1] = arr[0];
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(Arrays.toString(swap(arr)));
    }
}
