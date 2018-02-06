package w3resource.Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 06.02.2018
 */
public class Ex12 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Black");
        stringArrayList.add("White");
        stringArrayList.add("Red");
        stringArrayList.add("Orange");
        stringArrayList.add("Yellow");
        List arrayList = stringArrayList.subList(1, 3);
        System.out.println(stringArrayList);
        System.out.println(arrayList);
    }

}
