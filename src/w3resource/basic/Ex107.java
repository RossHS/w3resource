package w3resource.basic;

/**
 * Created by Ross on 14.10.2017.
 */
public class Ex107 {
    private int[] nums;

    Ex107(int... nums) {
        this.nums = nums;
    }

    public boolean test() {
        boolean bool = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] < nums[i + 1] && nums[i + 1] < nums[i + 2]) bool = true;
        }
        return bool;
    }

    public static void main(String[] args) {
        Ex107 test = new Ex107(1, 1, 2, 0, 2, 3);
        System.out.println(test.test());
    }
}

