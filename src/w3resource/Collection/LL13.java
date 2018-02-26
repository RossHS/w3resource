package w3resource.Collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 26.02.2018
 */
public class LL13 {
    private static void removeLF(List list) {
        if (list == null || list.size() < 2) return;
        list.remove(0);
        list.remove(list.size() - 1);
    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);
        removeLF(list);
        System.out.println(list);
    }
}
