package w3resource.Collection;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 04.04.2018
 */
public class PQ12 {
    public static void main(String[] args) {
        PriorityQueue<Integer> integers = new PriorityQueue<>(Arrays.asList(1, -12, 24, 100, 54, -34));
        System.out.println(integers);
        while (!integers.isEmpty())
            System.out.print(integers.poll() + " ");
    }
}
