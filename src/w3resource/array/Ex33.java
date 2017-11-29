package w3resource.array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 29.11.2017
 */
public class Ex33 {
    public static void main(String[] args) {
        Integer[] num = {1, 2, 3, 2, 1, 3};
        int numLen = num.length;
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(num));
        int newLen = hs.size();
        System.out.println(numLen);
        System.out.println(newLen);
    }
}
