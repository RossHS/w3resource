package w3resource.Collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 07.02.2018
 */
public class Ex15 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(12, 2, 3));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(-12, -2, -3));
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.addAll(arrayList1);
        arrayList3.addAll(arrayList2);
        System.out.println(arrayList3);
    }
}
