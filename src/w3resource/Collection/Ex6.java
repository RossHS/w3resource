package w3resource.Collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 04.02.2018
 */
public class Ex6 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(111,22,33,45));
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList);
    }
}
