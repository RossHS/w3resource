package w3resource.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 06.02.2018
 */
public class Ex10 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Collections.shuffle(list);
        System.out.println(list);
    }
}
