package w3resource.array;

import java.util.HashSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 20.11.2017
 */
public class Ex15 {
    public static <T> void commonElementsOfArray(T[] a, T[] b) {
        HashSet<T> duplicateHS = new HashSet<>();
        for (T anA : a) {
            for (T aB : b) {
                if (anA.equals(aB)) {
                    duplicateHS.add(anA);
                    break;
                }
            }
        }
        System.out.print(duplicateHS);
    }

    public static void main(String[] args) {
        Integer[] a1 = {1, 2, 3, 4, 5, 8};
        Integer[] a2 = {1, 0, 8, -3, 10};
        commonElementsOfArray(a1, a2);
    }
}
