package w3resource.Collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 04.03.2018
 */
public class LL24 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        LinkedList<Integer> linkedList2 = new LinkedList<>(Arrays.asList(1, 2, 6, 4));
        equals(linkedList1, linkedList2);
    }

    private static <T> void equals(List<T> list1, List<T> list2) {
        for (T i : list1) {
            System.out.print(i + " ");
            System.out.println(list2.contains(i) ? "yes" : "no");
        }
    }
}
