package w3resource.Collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 07.02.2018
 */
public class Ex17 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4));
        arrayList.clear();
        System.out.println(arrayList);
    }
}
