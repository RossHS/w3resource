package w3resource.Collection;

import java.util.LinkedList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 10.02.2018
 */
public class LL1 {
    public static void main(String[] args) {
        LinkedList<StringBuilder> stringBuilders = new LinkedList<>();
        stringBuilders.add(new StringBuilder("123"));
        stringBuilders.get(0).append("456");
        System.out.println(stringBuilders);
    }
}
