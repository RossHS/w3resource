package w3resource.array;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 16.11.2017
 */
public class Ex10 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 0, 10};
        int max = nums[0];
        int min = nums[0];
        for (int a : nums) {
            if (max < a) max = a;
            if (min > a) min = a;
        }
        System.out.println(min + " " + max);
    }
}
