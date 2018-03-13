package w3resource.Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 13.03.2018
 */
public class TS2 {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>(Arrays.asList(1, 2, -3, 5, -1, 10));
        for (Iterator<Integer> iterator = integers.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}
