package w3resource.basic;

import java.util.Arrays;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex102 {
    public static void main(String[] args) {
        int[] num = {10, 20, 40, 30};
        int count10 = 0;
        int count30 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 10) count10++;
            if (num[i] == 30) count30++;
        }
        System.out.println(count10 > 0 && count30 > 0);
    }
}
