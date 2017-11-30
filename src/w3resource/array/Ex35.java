package w3resource.array;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 30.11.2017
 */
public class Ex35 {
    static int getResult(int[] a, int index1, int index2) {
        if (index1 > (a.length - 1) || index2 > (a.length - 1)) throw new ArrayIndexOutOfBoundsException();
        return a[index1] + a[index2];
    }

    public static void main(String[] args) {
        int[] a = {1,4,7,8,5};
        System.out.println(getResult(a,4,1));
    }
}
