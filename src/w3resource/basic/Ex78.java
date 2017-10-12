package w3resource.basic;

/**
 * Created by Ross on 12.10.2017.
 */
public class Ex78 {
    static boolean test(int[] arr) {
        return (arr.length == 2 && (arr[0] == 4 || arr[0] == 7) || (arr[1] == 4 || arr[1] == 7));
    }

    public static void main(String[] args) {
        int[] arr = {2, 7};
        System.out.println(test(arr));
    }
}
