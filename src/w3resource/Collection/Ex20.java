package w3resource.Collection;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 08.02.2018
 */
public class Ex20 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>(3);
        for (int i = 0; i < 17; i++) {
            list.add(i);
            System.out.format("Size: %2d, Capacity: %2d%n",
                    list.size(), getCapacity(list));
        }
    }

    public static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }
}
