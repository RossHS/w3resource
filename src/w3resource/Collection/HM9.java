package w3resource.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 07.04.2018
 */
public class HM9 {
    public static void main(String[] args) {
        HashMap<Integer, Test> integerTestHashMap = new HashMap<>();
        Test s = new Test(12, "Вася");
        integerTestHashMap.put(1, new Test(12, "Вася"));
        integerTestHashMap.put(2, s);
        integerTestHashMap.put(-1, new Test(22, "Кук"));
        integerTestHashMap.put(13, new Test(34, "Олег"));
        Set set = integerTestHashMap.entrySet();
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println(set);
    }
}
