package w3resource.array;

import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 14.11.2017
 */
public class Ex1 {
    public static <T extends Number> void sort(T... o) {
        Arrays.sort(o);
        System.out.println(Arrays.toString(o));
    }

    public static String[] sort(String[] str) {
        Arrays.sort(str);
        return str;
    }

    public static void main(String[] args) {
        Ex1.sort(12.2, 32.2, 65.1, 0.4);
        String[] strings = {"avs", "123", "HVS", "10", "0", "A"};
        String[] str = Ex1.sort(strings);
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(strings));
    }
}
