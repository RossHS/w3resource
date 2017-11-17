package w3resource.array;

import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 17.11.2017
 */
public class Ex11 {
    public static void reverse(int[] a) {
        int[] newA = a.clone();
        for (int i = 0; i < newA.length; i++) {
            a[i] = newA[newA.length - 1 - i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nums));
        reverse(nums);
        System.out.println(Arrays.toString(nums));
    }
}
