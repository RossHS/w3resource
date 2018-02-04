package w3resource.Collection;

import java.util.ArrayList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 04.02.2018
 */
public class Ex5 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> arrayList = new ArrayList<>();
        arrayList.add(new StringBuilder("one"));
        arrayList.add(new StringBuilder("two"));
        arrayList.add(new StringBuilder("three"));
        arrayList.add(new StringBuilder("four"));
        System.out.println(arrayList.set(2, new StringBuilder("3")));
        System.out.println(arrayList);
    }
}
