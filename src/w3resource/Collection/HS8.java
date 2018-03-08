package w3resource.Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 08.03.2018
 */
public class HS8 {
    public static void main(String[] args) {
        HashSet<Integer> integerHashSet = new HashSet<>(Arrays.asList(1, -2, 30, -4, 2, 5));
        TreeSet<Integer> integerTreeSet = new TreeSet<>(integerHashSet);
        System.out.println(integerHashSet);
        System.out.println(integerTreeSet);
    }
}
