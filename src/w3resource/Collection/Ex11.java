package w3resource.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 06.02.2018
 */
public class Ex11 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
