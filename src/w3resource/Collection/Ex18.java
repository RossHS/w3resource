package w3resource.Collection;

import java.util.ArrayList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 07.02.2018
 */
public class Ex18 {
    ArrayList<Integer> arrayList = new ArrayList<>();
    boolean aBoolean = arrayList.isEmpty();

    public static void main(String[] args) {
        Ex18 a = new Ex18();
        System.out.println(a.aBoolean);
    }
}
