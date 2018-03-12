package w3resource.Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 11.03.2018
 */
public class HS10 {
    public static <T> void compare(Set<T> s1, Set<T> s2) {
        HashSet<T> ts = new HashSet<>();
        for (T s : s1) {
            if (!s2.contains(s)) ts.add(s);
        }
        for (T s : s2) {
            if (!s1.contains(s)) ts.add(s);
        }
        System.out.println(ts);
    }

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> hashSet1 = new HashSet<>(Arrays.asList(30, 1, -1, 2, 4));
        compare(hashSet1, hashSet);
    }
}
