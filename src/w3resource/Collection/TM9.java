package w3resource.Collection;

import java.util.TreeMap;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 12.04.2018
 */
public class TM9 {
    public static void main(String[] args) {
        TreeMap<String, Integer> stringIntegerTreeMap = new TreeMap<>();
        stringIntegerTreeMap.put("a", 1);
        stringIntegerTreeMap.put("1-23", 231);
        stringIntegerTreeMap.put("A", 123);
        stringIntegerTreeMap.put("!", 2);
        System.out.println("First " + stringIntegerTreeMap.firstKey());
        System.out.println("Last " + stringIntegerTreeMap.lastKey());
    }
}
