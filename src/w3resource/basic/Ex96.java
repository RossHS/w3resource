package w3resource.basic;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex96 {
    public static void main(String[] args) {
        int[] arr = {1, 10, 11, 20, 30};
        boolean temp = false;
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                temp = true;
            }
            if (temp && arr[i] == 20) {
                result = true;
            }
        }
        System.out.println(result);
    }
}
