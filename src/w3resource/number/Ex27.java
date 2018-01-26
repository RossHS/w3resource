package w3resource.number;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 22.01.2018
 */
public class Ex27 {
    public static boolean isPrime(int num) {
        int temp = num;
        while (temp > 0) {
            int m = temp % 10;
            if (m!=3 && m!=1 && m!=7 && m!=9) return false;
            temp /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] ints = {12, 1339, 7654, 779};
        for (int anInt : ints) {
            System.out.println(isPrime(anInt));
        }
    }

}
