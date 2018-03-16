package w3resource.Collection;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 16.03.2018
 */
public class TS9 {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>(Arrays.asList(1, 10, 13, 12, -5, 4, 7));
        for (int e : integers) {
            if (e < 7) System.out.print(e+" ");
        }
    }
}
