package w3resource.Collection;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 12.03.2018
 */
public class HS12 {
    public static void main(String[] args) {
        HashSet<Integer> integerHashSet = new HashSet<>(Arrays.asList(1, 2, 30, 4, -5, 6));
        HashSet<Integer> integerHashSet1 = integerHashSet;
        System.out.println(integerHashSet1);
        integerHashSet.clear();
        System.out.println(integerHashSet1);
    }
}
