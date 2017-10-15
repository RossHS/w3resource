package w3resource.basic;

import java.util.Arrays;

/**
 * Created by Ross on 15.10.2017.
 */
public class Ex113 {
    static int[] sumArray(int[] num1, int[] num2) {
        int[] result = new int[num1.length + num2.length];
        System.arraycopy(num1, 0, result, 0, num1.length);
        System.arraycopy(num2, 0, result, num1.length, num2.length);
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 6};
        int[] nums2 = {1, 5, 9, 1};
        int[] res = sumArray(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}
