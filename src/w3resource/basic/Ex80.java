package w3resource.basic;

/**
 * Created by Ross on 12.10.2017.
 */
public class Ex80 {
    static int bignum(int[] array) {
        int big = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > big) {
                big = array[i];
            }
        }
        return big;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 7, 4, 5};
        System.out.println(bignum(array));
    }
}
