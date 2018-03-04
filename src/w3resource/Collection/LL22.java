package w3resource.Collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 04.03.2018
 */
public class LL22 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (linkedList.contains(num)) System.out.println(linkedList.getClass().getName() + " contains " + num);
                else System.out.println(linkedList.getClass().getName() + " doesn't contain " + num);
            }
        }
        System.out.println("end");
    }
}
