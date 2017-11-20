package w3resource.array;

import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 20.11.2017
 */
public class Ex18 {
    static int getSecondMinElement(int[] a) {
        int[] b = a.clone();
        Arrays.sort(b);
        return b[1];
    }

    public static void main(String[] args) {
        int[] a = {1, 20, 3, 6, 2, 10, 9, 3, 11};
        System.out.println(Arrays.toString(a));
        System.out.println(getSecondMinElement(a));
        System.out.println(Arrays.toString(a));
    }
}
