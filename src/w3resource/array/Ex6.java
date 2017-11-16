package w3resource.array;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 16.11.2017
 */
public class Ex6 {
    public static int getIndex(int[] nums, int val) {
        if (nums == null) return -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {20, 30, 40, 50};
        int val = 30;
        int val2 = 23;
        System.out.println(getIndex(nums,val));
        System.out.println(getIndex(nums,val2));
    }
}
