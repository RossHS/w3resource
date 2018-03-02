package w3resource.Collection;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 02.03.2018
 */
public class LL20 {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(integers.getFirst());
        System.out.println(integers);
        LinkedList<Integer> linkedList = new LinkedList<>();
    }
}
