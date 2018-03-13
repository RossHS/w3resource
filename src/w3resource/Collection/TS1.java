package w3resource.Collection;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 13.03.2018
 */
public class TS1 {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>(Arrays.asList("Black", "White", "Yellow", "Brown", "Red"));
        System.out.println(strings);
    }
}
