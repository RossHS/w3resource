package w3resource.basic;

import java.util.Arrays;

/**
 * Created by Ross on 12.10.2017.
 */
public class Ex77 {
    static int[] newArray(int[] arr1, int[] arr2) {
        int[] newArr = {arr1[0], arr2[arr2.length - 1]};
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {2, 3, 5};
        int[] arr3 = newArray(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
    }
}
