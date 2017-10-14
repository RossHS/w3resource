package w3resource.basic;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex105 {
    public static void main(String[] args) {
        int[] nums = {10, 11, 12, 5, 67, 10, 11, 12};
        int endValue = nums.length - 3;
        int count = 0;

        for (int i = 0; i < 3; i++) {
            if (nums[i] == nums[endValue + i]) {
                count++;
            }
        }
        System.out.println(count == 3);
    }
}
