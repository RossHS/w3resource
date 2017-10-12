package w3resource.basic;

/**
 * Created by Ross on 12.10.2017.
 */
public class Ex76 {
    static boolean equals(int[] arr1, int[] arr2) {
        return arr1[0] == arr2[0] || arr1[arr1.length - 1] == arr2[arr2.length - 1];
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {2, 54, 19, 10};
        System.out.println(equals(arr1, arr2));
    }
}
