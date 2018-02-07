package w3resource.Collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 07.02.2018
 */
public class Ex13 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(1, 7, 2, 3));
        boolean res = arrayList1.containsAll(arrayList2);
        System.out.println(res);
        for (Integer a : arrayList2) {
            System.out.println(a + (arrayList1.contains(a) ? " есть" : " нет"));
        }
    }
}
