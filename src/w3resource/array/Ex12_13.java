package w3resource.array;

import java.util.HashSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 17.11.2017
 */
public class Ex12_13 {
    public static <T> void duplicate(T[] o) {
        HashSet<T> duplicateHS = new HashSet<>();
        for (int i = 0; i < o.length; i++) {
            for (int j = i + 1; j < o.length; j++) {
                if (o[i].equals(o[j])) duplicateHS.add(o[i]);
            }
        }
        System.out.print(duplicateHS);
    }

    public static void main(String[] args) {
        Integer[] a = {0, 1, 1, 2, 3, 4, 5, 5, 6, 6, 0};
        String[] str = {"A", "C", "B", "V", "C", "B", "C"};
        duplicate(a);
        System.out.println();
        duplicate(str);
    }
}
