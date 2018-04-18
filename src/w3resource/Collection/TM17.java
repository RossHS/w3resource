package w3resource.Collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 18.04.2018
 */
public class TM17 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map1 = new TreeMap<>();
        // Put elements to the map
        tree_map1.put(10, "Red");
        tree_map1.put(20, "Green");
        tree_map1.put(40, "Black");
        tree_map1.put(50, "White");
        tree_map1.put(60, "Pink");
        Integer integerStringTreeMap = tree_map1.lowerKey(40);
        System.out.println(integerStringTreeMap);
    }
}
