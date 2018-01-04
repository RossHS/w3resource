package w3resource.number;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 04.01.2018
 */
public class Ex6 {
    public static boolean isNarcissisticDecimal(int num) {
        String str = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i <str.length() ; i++) {
            sum += Math.pow(Character.digit(str.charAt(i),10),str.length());
        }
        return num == sum;
    }

    public static void main(String[] args) {
        List<Integer> narcissistic = new ArrayList<>();
        for (int i = 0, count = 0; count <= 15; i++) {
            if (isNarcissisticDecimal(i)) {
                count++;
                narcissistic.add(i);
            }
        }
        System.out.println(narcissistic);
    }
}
