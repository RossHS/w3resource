package w3resource.array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 17.11.2017
 */
public class Ex14 {
    public static <T> void duplicateOfTwoArray(T[] a, T[] b) {
        HashSet<T> dupHS = new HashSet<>();
        for (T anA : a) {
            for (T aB : b) {
                if (anA.equals(aB)) {
                    dupHS.add(anA);
                    break;
                }
            }
        }
        System.out.println(dupHS);
    }

    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));

        duplicateOfTwoArray(array1, array2);
    }
}
