package w3resource.basic;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex98 {
    public static void main(String[] args) {
        int[] arr = {20, 10, 20, 30, 20};
        int count = 0;
        if (arr[arr.length - 1] == 20 && arr[arr.length - 2] != 20) count++;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 20 && arr[i + 1] != 20) {
                count++;
            }
        }
        System.out.println(String.valueOf(count == 3));
    }
}
