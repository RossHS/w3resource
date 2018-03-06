package w3resource.Collection;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 06.03.2018
 */
public class HS3 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(hs.size());
    }
}
