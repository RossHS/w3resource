package w3resource.Collection;

import java.util.ArrayList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 08.02.2018
 */
public class Ex21 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(10);
        arrayList.add(114);
        arrayList.set(1,101010);
        System.out.println(arrayList);
    }
}
