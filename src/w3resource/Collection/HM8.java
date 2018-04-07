package w3resource.Collection;

import java.util.HashMap;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 07.04.2018
 */
public class HM8 {
    public static void main(String[] args) {
        HashMap<Integer, Test> integerTestHashMap = new HashMap<>();
        Test s = new Test(12, "Вася");
        integerTestHashMap.put(1, new Test(12, "Вася"));
        integerTestHashMap.put(2, s);
        integerTestHashMap.put(-1, new Test(22, "Кук"));
        integerTestHashMap.put(13, new Test(34, "Олег"));
        System.out.println(integerTestHashMap.containsValue(new Test(22, "Кук")));
        System.out.println(integerTestHashMap.containsValue(s));
    }
}
