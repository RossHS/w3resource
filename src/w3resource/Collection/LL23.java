package w3resource.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 04.03.2018
 */
public class LL23 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> arrayList = new ArrayList<>(linkedList);
        System.out.println(arrayList);
    }
}
