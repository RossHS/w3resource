package w3resource.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 25.11.2017
 */
public class Ex21 {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(a));
        Integer[] b = new Integer[arrayList.size()];
        for (Integer num: b) {
            System.out.print(num + " ");
        }
    }
}
