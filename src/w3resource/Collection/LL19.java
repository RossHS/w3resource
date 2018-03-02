package w3resource.Collection;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 02.03.2018
 */
public class LL19 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 4, 5, 6));
        System.out.println(linkedList.pop());
        System.out.println(linkedList);
    }
}
