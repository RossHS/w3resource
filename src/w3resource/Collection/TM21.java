package w3resource.Collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 25.04.2018
 */
public class TM21 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "A");
        map.put(-10, "B");
        map.put(40, "C");
        map.put(0, "D");
        map.put(120, "E");
        map.put(2, "F");
        System.out.println(map);
        Map<Integer, String> sub = map.subMap(0, 40);
        System.out.println(map);
        System.out.println(sub);
    }
}
