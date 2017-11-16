package w3resource.array;

import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 16.11.2017
 */
public class Ex7 {
    public static int[] getNewArray(int[] array, int delValue) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != delValue) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int [] newAr = getNewArray(array, 2);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newAr));
    }
}
