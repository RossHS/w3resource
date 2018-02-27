package w3resource.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 27.02.2018
 */
public class LL16 {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.shuffle(integerList);
        System.out.println(integerList);
        Collections.shuffle(integerList);
        System.out.println(integerList);
    }
}
