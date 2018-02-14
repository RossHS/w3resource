package w3resource.Collection;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 14.02.2018
 */
public class LL9 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,4,5,6));
        linkedList.add(1,10);
        System.out.println(linkedList);
    }
}
