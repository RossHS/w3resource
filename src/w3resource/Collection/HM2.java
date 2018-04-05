package w3resource.Collection;

import java.util.HashMap;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 05.04.2018
 */
public class HM2 {
    public static void main(String[] args) {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(1, "Вася");
        integerStringHashMap.put(2, "Петя");
        integerStringHashMap.put(-1, "Аня");
        System.out.println(integerStringHashMap.size());
    }
}
