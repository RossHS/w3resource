package w3resource.Collection;

import java.util.ArrayList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 08.02.2018
 */
public class Ex19 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(20);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(16);
        System.out.println(arrayList.size());
        arrayList.trimToSize();
        System.out.println(arrayList.size());
    }
}
