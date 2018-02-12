package w3resource.Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 11.02.2018
 */
public class LL4 {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        Iterator iterator = integers.descendingIterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }
    }
}
