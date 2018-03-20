package w3resource.Collection;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 20.03.2018
 */
public class PQ3 {
    public static void main(String[] args) {
        PriorityQueue<Integer> integers = new PriorityQueue<>(Arrays.asList(1, 2, 3, 4, -1));
        PriorityQueue<Integer> integers1 = new PriorityQueue<>(integers);
        System.out.println(integers1);
    }
}
