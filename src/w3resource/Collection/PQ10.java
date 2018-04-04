package w3resource.Collection;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 04.04.2018
 */
public class PQ10 {
    public static void main(String[] args) {
        PriorityQueue<Integer> integers = new PriorityQueue<>(Arrays.asList(1,2,3,4,5,6));
        Integer[] integers1 = integers.toArray(new Integer[0]);
        for(int a : integers){
            System.out.println(a);
        }
    }
}
