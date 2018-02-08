package w3resource.Collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 08.02.2018
 */
public class Ex22 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 5, 6));
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
