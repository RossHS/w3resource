package w3resource.Collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 09.04.2018
 */
public class TM3 {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerTreeMap = new TreeMap<>();
        stringIntegerTreeMap.put("a", 1);
        stringIntegerTreeMap.put("1-23", 231);
        stringIntegerTreeMap.put("A", 123);
        stringIntegerTreeMap.put("!", 2);
        if(stringIntegerTreeMap.containsKey("a")) System.out.println("OK");
        else System.out.println("not");
        if(stringIntegerTreeMap.containsKey("b")) System.out.println("OK");
        else System.out.println("not");
    }
}
