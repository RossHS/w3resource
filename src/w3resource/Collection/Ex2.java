package w3resource.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 03.02.2018
 */
public class Ex2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Red","Blue","Green"));
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
          String s =  iterator.next().toUpperCase();
          System.out.println(s);
        }
        System.out.println(arrayList);
    }
}
