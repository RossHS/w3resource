package w3resource.dataTypes;

import java.util.ArrayList;

/**
 * Created by Ross on 03.11.2017.
 */
public class Ex10 {
    static void version1(int a) {
        ArrayList<Integer> nums = new ArrayList<>();
        while (a != 0) {
            nums.add(a % 10);
            a /= 10;
        }
        for (int i = nums.size() - 1; i >= 0; i--) {
            System.out.print(nums.get(i) + " ");
        }
    }

    static void version2(int a) {
        String str = Integer.toString(a);
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        int a = 123456;
        version1(a);
        System.out.println();
        version2(a);
    }
}
