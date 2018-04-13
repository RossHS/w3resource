package w3resource.Collection;

import java.util.TreeMap;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 13.04.2018
 */
public class TM11<K, V> {
    private TreeMap<K, V> integerStringTreeMap;

    public TM11(K[] ints, V[] strings) {
        if (ints.length != strings.length) return;
        integerStringTreeMap = new TreeMap<>();
        for (int j = 0; j < ints.length; j++) {
            integerStringTreeMap.put(ints[j], strings[j]);
        }
        System.out.println(integerStringTreeMap);
    }

    public K getSmaller(K val) {
        return integerStringTreeMap.floorKey(val);
    }


    public static void main(String[] args) {
        Integer[] ints = new Integer[]{1, 2, 3};
        TM11<Integer, String> tm11 = new TM11(ints, new String[]{"a", "b", "AB"});
        System.out.println(tm11.getSmaller(2));
    }
}
