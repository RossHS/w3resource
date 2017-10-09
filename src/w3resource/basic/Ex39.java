package w3resource.basic;

/**
 * Created by Ross on 09.10.2017.
 */
public class Ex39 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int numOfnums = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if ((i != j) && (j != k) && (i != k)) {
                        System.out.println(nums[i] + "" + nums[j] + "" + nums[k]);
                        numOfnums++;
                    }
                }
            }
        }
        System.out.println("Total nums: " + numOfnums);
    }
}
