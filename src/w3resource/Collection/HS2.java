package w3resource.Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 06.03.2018
 */
public class HS2 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator<Integer> iterator = hs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
