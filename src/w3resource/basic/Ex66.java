package w3resource.basic;

import java.util.ArrayList;

/**
 * Created by Ross on 11.10.2017.
 */
public class Ex66 {
    public static int PrimeNumSum() {
        ArrayList<Integer> primeNum = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 1; primeNum.size() != 100; i++) {
            int mod = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    mod++;
                }
            }
            if (mod == 2) {
                primeNum.add(i);
            }
        }
        for (int i = 0; i < primeNum.size(); i++) {
            sum += primeNum.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(PrimeNumSum());
    }
}
