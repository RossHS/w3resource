package w3resource.Collection;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 13.03.2018
 */
public class TS3 {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>(Arrays.asList(1, 2, -3, 4));
        TreeSet<Integer> integers1 = new TreeSet<>(Arrays.asList(-1, 3, 4));
        TreeSet<Integer> integers2 = new TreeSet<>();
        integers2.addAll(integers);
        integers2.addAll(integers1);
        System.out.println(integers2);
    }
}
