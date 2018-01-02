package w3resource.number;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 02.01.2018
 */
public class Ex2 {
    public static boolean isAbundant(int num) {
        int divisors = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) divisors += i;
        }
        return num < divisors;
    }

    public static void main(String[] args) {
        System.out.println(isAbundant(12));
        System.out.println(isAbundant(11));
    }
}
