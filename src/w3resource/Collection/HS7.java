package w3resource.Collection;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 08.03.2018
 */
public class HS7 {
    public static void main(String[] args) {
        HashSet<Integer> integerHashSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] integers = integerHashSet.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));
        System.out.println(integerHashSet.getClass().getName());
    }
}
