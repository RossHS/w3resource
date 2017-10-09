package w3resource.basic;

import java.util.ArrayList;

/**
 * Created by Ross on 09.10.2017.
 */
public class Ex50 {
    public static void main(String[] args) {
        ArrayList divBy3 = new ArrayList();
        ArrayList divBy5 = new ArrayList();
        ArrayList divBy3n5 = new ArrayList();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                divBy3.add(i);
            }
            if (i % 5 == 0) {
                divBy5.add(i);
            }
            if (i % 3 == 0 && i % 5 == 0) {
                divBy3n5.add(i);
            }
        }
        System.out.println("Divided by 3: " + divBy3);
        System.out.println("Divided by 5: " + divBy5);
        System.out.println("Divided by 3 and 5: " + divBy3n5);
    }
}
