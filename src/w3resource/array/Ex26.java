package w3resource.array;

import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 27.11.2017
 */
public class Ex26 {
    static int[] gerArray(int[] array) {
        int[] newAr = new int[array.length];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newAr[j] = array[i];
                j++;
            }
        }
        return newAr;
    }

    public static void main(String[] args) {
        int[] array = {1, 0, 2, 0, 0, 0, 6};
        int[] array1 = gerArray(array);
        System.out.println(Arrays.toString(array1));
    }
}
