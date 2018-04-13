package w3resource.Collection;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 13.04.2018
 */
public class TM10{
    public static void main(String[] args) {
        TreeMap<String, Integer> stringIntegerTreeMap = new TreeMap<>(Comparator.reverseOrder());
        stringIntegerTreeMap.put("a", 1);
        stringIntegerTreeMap.put("1-23", 231);
        stringIntegerTreeMap.put("A", 123);
        stringIntegerTreeMap.put("!", 2);
        System.out.println(stringIntegerTreeMap);
    }
}
