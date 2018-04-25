package w3resource.Collection;

import java.util.TreeMap;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 25.04.2018
 */
public class TM19 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "A");
        map.put(-10, "B");
        map.put(40, "C");
        map.put(0, "D");
        map.put(120, "E");
        map.put(2, "F");
        System.out.println(map);
        System.out.println(map.pollFirstEntry());
        System.out.println(map);
    }
}
