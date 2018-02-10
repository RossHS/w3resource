package w3resource.Collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 10.02.2018
 */
public class LL3 {
    public static void main(String[] args) {
        LinkedList<StringBuilder> linkedList = new LinkedList<>();
        linkedList.add(new StringBuilder("abcd"));
        linkedList.add(new StringBuilder("1bcd"));
        linkedList.add(new StringBuilder("2bcd"));
        linkedList.add(new StringBuilder("3bcd"));
        linkedList.add(new StringBuilder("4bcd"));
        Iterator<StringBuilder> iterator = linkedList.listIterator(3);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
