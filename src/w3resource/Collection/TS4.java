package w3resource.Collection;

import java.util.*;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 14.03.2018
 */
public class TS4 {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>((o1, o2) -> o2-o1);
        integers.add(-2);
        integers.add(2);
        integers.add(-12);
        integers.add(22);
        integers.add(3);
        System.out.println(integers.first());
        System.out.println(integers);
        for (Iterator<Integer> iterator = integers.descendingIterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
        TreeMap<Integer,String> integerStringTreeMap = new TreeMap<>();
        integerStringTreeMap.put(1,"SSSSSSS");
        System.out.println(integerStringTreeMap.get(1));
    }

}