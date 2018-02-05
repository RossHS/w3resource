package w3resource.Collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 05.02.2018
 */
public class Ex8 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 10, 6, 2, 30, -2));
        System.out.println(arrayList);
        arrayList.sort(Integer::compareTo);
        System.out.println(arrayList);
    }
}
