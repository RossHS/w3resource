package w3resource.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 05.02.2018
 */
public class Ex9 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(-1,-2,-3,-4));
        arrayList2.addAll(arrayList);
        System.out.println(arrayList2);
        Collections.copy(arrayList2,arrayList);
        System.out.println(arrayList2);
    }
}
