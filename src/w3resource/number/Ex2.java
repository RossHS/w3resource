package w3resource.number;

/**
 * @author Ross Khapilov
 * @version 2.0 created on 02.01.2018
 */
public class Ex2 {
    public static boolean isAbundant(int num) {
        int divisors = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) divisors += i;
        }
        return num < divisors;
    }
    public static boolean isPerfectNumber(int num) {
        int divisors = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) divisors += i;
        }
        return num == divisors;
    }
    public static boolean isDeficientNumber(int num) {
        int divisors = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) divisors += i;
        }
        return num > divisors;
    }

    public static void main(String[] args) {
        int countAbundant = 0;
        int countPerfect = 0;
        int countDeficient = 0;
        for (int i = 1; i < 10_000; i++) {
            if(isAbundant(i)) countAbundant++;
            if(isPerfectNumber(i)) countPerfect++;
            if(isDeficientNumber(i)) countDeficient++;
        }
        System.out.println("Abundant: " + countAbundant);
        System.out.println("Perfect number: " + countPerfect);
        System.out.println("Deficient : " + countDeficient);

    }
}
