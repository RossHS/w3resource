package w3resource.Collection;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 19.03.2018
 */
public class TS15 {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>(Arrays.asList("A", "B", "CA", "a", "AA"));
        System.out.println(strings.pollLast());
        System.out.println(strings);
    }
}
