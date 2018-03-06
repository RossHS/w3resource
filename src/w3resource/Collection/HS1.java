package w3resource.Collection;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 06.03.2018
 */
public class HS1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>(Arrays.asList("abc", "ZA", "1-0", "A"));
        hs.add("2");
        System.out.println(hs);
    }
}