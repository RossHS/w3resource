package w3resource.Collection;

import java.util.HashMap;
import java.util.Set;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 08.04.2018
 */
public class HM11 {
    public static void main(String[] args) {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(1, "ABC");
        integerStringHashMap.put(2, "A");
        integerStringHashMap.put(3, "AC");
        integerStringHashMap.put(4, "C");
        integerStringHashMap.put(5, "B");
        integerStringHashMap.put(6, "BC");
        Set a = integerStringHashMap.keySet();
        System.out.println(a.getClass().getName());
    }
}
