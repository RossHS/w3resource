package w3resource.Collection;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 17.02.2018
 */
public class LL11 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i) + " номер " + i);
        }
    }
}
