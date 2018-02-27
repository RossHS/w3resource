package w3resource.Collection;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 27.02.2018
 */
public class LL17 {
    public static void main(String[] args) {
        LinkedList<Integer> integers1 = new LinkedList<>(Arrays.asList(1, 3, 4));
        LinkedList<Integer> integers2 = new LinkedList<>(Arrays.asList(5, 6, 7));
        integers1.addAll(integers2);
        System.out.println(integers1);
    }
}
