package w3resource.methods;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 28.12.2017
 */
public class Ex16 {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        int div = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) div++;
        }
        return div == 2;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
}
