package w3resource.Collection;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 26.02.2018
 */
public class LL14 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("a", "b", "c"));
        System.out.println(linkedList);
        linkedList.clear();
        System.out.println(linkedList);
    }
}
