package w3resource.Collection;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 11.03.2018
 */
public class HS11 {
    public static <T> HashSet<T> compare(HashSet<T> hs, HashSet<T> hs1) {
        HashSet<T> set =(HashSet<T>) hs.clone();
        set.retainAll(hs1);
        return set;
    }

    public static void main(String[] args) {
        HashSet<Integer> integerHashSet = new HashSet<>(Arrays.asList(1, 2, 30, 4, -5, 6));
        HashSet<Integer> integerHashSet1 = new HashSet<>(Arrays.asList(4, -1, -2, 3, 5, 6));
        HashSet<Integer> integerHashSet2 = compare(integerHashSet, integerHashSet1);
        System.out.println(integerHashSet2);
    }
}
