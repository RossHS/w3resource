package w3resource.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 20.11.2017
 */
public class Ex16 {
    public static void main(String[] args) {
        Integer[] a = {10, 22, 10, 20, 11, 22};
        Set<Integer> hs = new HashSet<>();
        hs.addAll(Arrays.asList(a));
        System.out.println(hs);
    }
}
