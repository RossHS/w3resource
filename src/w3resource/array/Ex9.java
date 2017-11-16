package w3resource.array;

import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 16.11.2017
 */
public class Ex9 {
    public static int[] reformArray(int[] num, int val, int index) {
        int[] newArr = Arrays.copyOf(num, num.length + 1);
        newArr[index] = val;
        System.arraycopy(num, index, newArr, index + 1, newArr.length - (index + 1));
        return newArr;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(reformArray(num, 10, 4)));
    }
}
