package w3resource.Collection;

import java.util.HashMap;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 07.04.2018
 */
public class HM7 {
    public static void main(String[] args) {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(1, "ABC");
        integerStringHashMap.put(2, "A");
        integerStringHashMap.put(3, "AC");
        integerStringHashMap.put(4, "C");
        integerStringHashMap.put(5, "B");
        integerStringHashMap.put(6, "BC");
        System.out.println(integerStringHashMap.containsKey(3));
        System.out.println(integerStringHashMap.get(3));
        System.out.println(integerStringHashMap.containsKey(8));
    }
}
