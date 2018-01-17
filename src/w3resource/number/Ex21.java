package w3resource.number;

import java.util.ArrayList;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 17.01.2018
 */
public class Ex21 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 1; i < 100_000; i++) {
            int sum = 0;
            int count = 0;
            for (int j = 1; j < i; j++) {
                int num1 = j * j * j;
                for (int k = j; k < i; k++) {
                    int num2 = k * k * k;
                    sum = num1 + num2;
                    if (i == sum) count++;
                    if (i <= sum) break;
                }
                if (count == 2) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
