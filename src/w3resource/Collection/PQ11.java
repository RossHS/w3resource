package w3resource.Collection;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 04.04.2018
 */
public class PQ11 {
    public static void main(String[] args) {
        PriorityQueue<Integer> integers = new PriorityQueue<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        String s = integers.toString();
        System.out.println(integers);
        integers.removeIf(e -> e % 2 == 0);
        System.out.println(s);
        System.out.println(integers);
    }
}
