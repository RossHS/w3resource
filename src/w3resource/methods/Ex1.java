package w3resource.methods;

import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 25.12.2017
 */
public class Ex1 {
    public static int getMin(final int[] a) {
        int[] newA = a.clone();
        Arrays.sort(newA);
        return newA[0];
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, -2, -1, 4, 1};
        System.out.println(getMin(a));
        System.out.println(Arrays.toString(a));
    }
}
