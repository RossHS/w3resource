package w3resource.Collection;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 02.03.2018
 */
public class LL21 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        int a = 5;
        if (linkedList.contains(a)) {
            System.out.println(linkedList + " contains " + a);
        } else System.out.println("Not");
    }
}
