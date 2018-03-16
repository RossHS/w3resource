package w3resource.Collection;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 16.03.2018
 */
public class TS8 {
    private static <E> TreeSet<E> compare(TreeSet<E> ts1, TreeSet<E> ts2) {
        TreeSet<E> integers = new TreeSet<>();
        for (E s : ts1) {
            if (!ts2.contains(s)) integers.add(s);
        }
        for (E s : ts2) {
            if (!ts1.contains(s)) integers.add(s);
        }
        return integers;
    }

    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>(Arrays.asList(1, -2, -12, 4, 3));
        TreeSet<Integer> integers1 = new TreeSet<>(Arrays.asList(1, -1, 3));
        TreeSet<Integer> ts = compare(integers, integers1);
        System.out.println(ts);
    }
}
