package w3resource.array;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 30.11.2017
 */
public class Ex36 {
    static int getResult(int[] a) {
        int res = 0;
        if (a.length < 3) throw new ArrayIndexOutOfBoundsException();
        int num1 = a[0];
        int num2 = a[1];
        int num3 = a[2];
        for (int i = 0; i < a.length - 2; i++) {
            if (num1 <= num2 && num2 <= num3)
                return res = num1 + num2 + num3;
            num1 = a[i];
            num2 = a[i + 1];
            num3 = a[i + 2];

        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, -1, 10, 4, 7, 8, 5};
        System.out.println(getResult(a));
    }
}
