package w3resource.number;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 07.01.2018
 */
public class Ex12 {
    public static boolean isHarshad(final int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int m = temp % 10;
            sum += m;
            temp /= 10;
        }
        return num % sum == 0;
    }

    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            if (isHarshad(i)) System.out.print(i + " ");
        }
    }
}
