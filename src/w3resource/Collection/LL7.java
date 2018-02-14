package w3resource.Collection;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 14.02.2018
 */
public class LL7 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        linkedList.offerFirst(12);
    }
}
