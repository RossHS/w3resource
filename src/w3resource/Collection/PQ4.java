package w3resource.Collection;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 21.03.2018
 */
public class PQ4 {
    public static void main(String[] args) {
        PriorityQueue<Integer> integers = new PriorityQueue<>(Arrays.asList(2, 3, 4, -2, -1, 0, 1));
        integers.offer(10);
        System.out.println(integers);
    }
}
