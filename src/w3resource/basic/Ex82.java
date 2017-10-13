package w3resource.basic;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex82 {
    static int find(int[] arr) {
        int maxNum = arr[0];
        if (maxNum < arr[arr.length / 2]) {
            maxNum = arr[arr.length / 2];
        }
        if (maxNum < arr[arr.length - 1]) {
            maxNum = arr[arr.length - 1];
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(find(arr));
    }
}
