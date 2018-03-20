package w3resource.Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 20.03.2018
 */
public class PQ2 {
    public static void main(String[] args) {
        PriorityQueue<String> strings = new PriorityQueue<>(Comparator.comparingInt(String::length));
        strings.add("ABCD");
        strings.add("A");
        strings.add("asdasdasd");
        strings.add("---");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
