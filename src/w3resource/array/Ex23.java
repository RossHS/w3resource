package w3resource.array;

import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 26.11.2017
 */
public class Ex23 {
    static void pairsValue(int[] inputArray, int inputNumber) {
        int sum = 0;

        for (int a : inputArray)
            sum += a;
        boolean res = sum == inputNumber;
        System.out.println(Arrays.toString(inputArray) + " его сумма " + sum + " равна/не равна " + res + " проверочному числу " + inputNumber);
    }

    public static void main(String[] args) {
        pairsValue(new int[]{1, 2, 3, 4, 5}, 15);
        pairsValue(new int[]{1, 2, 3, 4, 5}, 11);
    }
}
