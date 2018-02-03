package w3resource.Collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 03.02.2018
 */
public class Ex3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Red","Blue","Green"));
        arrayList.add(2,"Pink");
        arrayList.add(0,"Black");
        arrayList.set(1,"White");
        System.out.println(arrayList);
    }
}
