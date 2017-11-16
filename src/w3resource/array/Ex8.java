package w3resource.array;

import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 16.11.2017
 */
public class Ex8 {
    public static void main(String[] args) {
        int[] nums = {12, 2, 23, 45};
        int[] newArr = Arrays.copyOf(nums, nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(newArr));
    }
}
