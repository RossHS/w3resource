package w3resource.basic;

import java.util.Arrays;

/**
 * Created by Ross on 14.10.2017.
 */
public class Ex106 {
    static int[] getNewArray(int[] num){
        int[] numNew = new int[num.length];
        numNew[numNew.length-1] = num[0];
        for (int i = 0; i < numNew.length-1; i++) {
            numNew[i] = num[i+1];
        }
        return numNew;
    }
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50};
        System.out.println(Arrays.toString(getNewArray(num)));
    }
}
