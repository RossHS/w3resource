package w3resource.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 26.02.2018
 */
public class LL15 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.swap(linkedList, 0, 3);
        System.out.println(linkedList);
    }
}
