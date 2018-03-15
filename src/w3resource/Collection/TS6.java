package w3resource.Collection;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 15.03.2018
 */
public class TS6 {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        TreeSet<Integer> integers1 = new TreeSet<>(integers);
        System.out.println(integers1);
    }
}
