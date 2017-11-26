package w3resource.array;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 26.11.2017
 */
public class Ex24 {
    static int missingNumber(int[] array) {
        int[] newAr = new int[array.length];
        for (int i = array[0], j = 0; j < array.length; i++, j++)
            newAr[j] = i;
        for (int i = 0; i < newAr.length; i++)
            if (newAr[i] != array[i]) return newAr[i];
        return 0;
    }

    public static void main(String[] args) {
        int num = missingNumber(new int[]{1, 2, 3, 4, 6, 7});
        System.out.println(num);
    }
}
