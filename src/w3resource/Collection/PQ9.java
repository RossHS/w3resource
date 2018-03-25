package w3resource.Collection;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 25.03.2018
 */
public class PQ9 {
    public static void main(String[] args) {
        PriorityQueue<Integer> integers = new PriorityQueue<>(Arrays.asList(1, 2, -3, 4, -5));
        System.out.println(integers.poll());
        System.out.println(integers);
    }
}
