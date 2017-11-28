package w3resource.array;

import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 28.11.2017
 */
public class Ex29 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 2};
        int average = 0;
        Arrays.sort(a);
        for (int i = 1; i < a.length - 1; i++) {
            average += a[i];
        }
        System.out.println(average);
    }
}
