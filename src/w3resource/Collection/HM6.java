package w3resource.Collection;

import java.util.HashMap;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 06.04.2018
 */
public class HM6 {
    public static void main(String[] args) {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(1, "ABC");
        integerStringHashMap.put(2, "A");
        integerStringHashMap.put(3, "AC");
        integerStringHashMap.put(4, "C");
        integerStringHashMap.put(5, "B");
        integerStringHashMap.put(6, "BC");
        HashMap<Integer, String> integerStringHashMap1 = new HashMap<>();
        putAll(integerStringHashMap1, integerStringHashMap);
        System.out.println(integerStringHashMap1);
    }

    private static <T, V> void putAll(HashMap<T, V> newOne, HashMap<T, V> old) {
        old.forEach(newOne::put);
    }
}
