package w3resource.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 25.11.2017
 */
public class Ex20 {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 34, 5, 6, 8};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(a));
        System.out.println(al);
    }
}
