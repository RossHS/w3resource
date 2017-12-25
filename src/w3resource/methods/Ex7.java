package w3resource.methods;

import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 25.12.2017
 */
public class Ex7 {
    static int[] getFirstPentagonalNumber(int amountOfNumbers) {
        int[] pentNum = new int[amountOfNumbers];
        for (int i = 0, c = 1; i < pentNum.length; i++, c++) {
            pentNum[i] = (3 * c * c - c) / 2;
        }
        return pentNum;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFirstPentagonalNumber(50)));
    }
}
