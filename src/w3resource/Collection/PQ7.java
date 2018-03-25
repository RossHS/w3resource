package w3resource.Collection;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 25.03.2018
 */
public class PQ7 {
    private static <E> PriorityQueue<E> compare(PriorityQueue<E> pq1, PriorityQueue<E> pq2) {
        PriorityQueue<E> es = new PriorityQueue<>();
        for (E a : pq1) {
            if (!pq2.contains(a)) es.add(a);
        }
        for (E a : pq2) {
            if (!pq1.contains(a)) es.add(a);
        }
        return es;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> integers1 = new PriorityQueue<>(Arrays.asList(1, 2, -3, 4));
        PriorityQueue<Integer> integers2 = new PriorityQueue<>(Arrays.asList(-5, 4, 1));
        PriorityQueue<Integer> integers3 = compare(integers1, integers2);
        System.out.println(integers3);
    }
}
