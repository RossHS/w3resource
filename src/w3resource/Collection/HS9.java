package w3resource.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 08.03.2018
 */
public class HS9 {
    public static void main(String[] args) {
        HashSet<Integer> integerHashSet = new HashSet<>(Arrays.asList(1, -2, 30, -4, 2, 5));
        ArrayList<Integer> arrayList = new ArrayList<>(integerHashSet);
        Collections.sort(arrayList);
        System.out.println(integerHashSet);
        System.out.println(arrayList);
    }
}
