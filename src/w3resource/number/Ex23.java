package w3resource.number;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 20.01.2018
 */
public class Ex23 {
    public static boolean isNarcissisticDecimal(int num) {
        String str = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Math.pow(Character.digit(str.charAt(i),10),str.length());
        }
        return num==sum;
    }

    public static void main(String[] args) {
        for (int i = 1; i <1_000 ; i++) {
            if (isNarcissisticDecimal(i)) System.out.print(i + " ");
        }
    }
}
