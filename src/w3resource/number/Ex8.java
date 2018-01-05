package w3resource.number;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 05.01.2018
 */
public class Ex8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i <= 10; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum+= list.get(j)*list.get(i-1-j);
            }
            list.add(sum);
        }
        System.out.println(list);
    }
}
