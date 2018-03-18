package w3resource.Collection;

import java.util.TreeSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 18.03.2018
 */
public class TS11 {
    public static void main(String[] args) {
        TreeSet<Integer> tree_num = new TreeSet<>();
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(82);
        tree_num.add(89);
        tree_num.add(14);

        System.out.println("Greater than or equal to 86 : " + tree_num.floor(86));
    }
}
