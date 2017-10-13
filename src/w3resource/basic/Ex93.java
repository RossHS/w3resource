package w3resource.basic;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex93 {
    public static void main(String[] args) {
        int[] array = {10, 10, 20, 30, 40};
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] == 10 && array[i + 1] == 10) || (array[i] == 20 && array[i + 1] == 20)) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println(true);
        } else System.out.println(false);
    }
}
