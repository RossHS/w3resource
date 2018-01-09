package w3resource.number;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 09.01.2018
 */
public class Ex16 {
    public static void main(String[] args) {
        System.out.println(isAmericable(220,284));
    }

    static boolean isAmericable(int num1, int num2) {
        int dev1 = 0;
        int dev2 = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) dev1 += i;
        }
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) dev2 += i;
        }
        return num1 == dev2 && num2 == dev1;
    }
}
