package w3resource.methods;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 25.12.2017
 */
public class Ex6 {
    static int sumOfDigits(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = 2612;
        System.out.println(sumOfDigits(a));
    }
}
