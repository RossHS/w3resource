package w3resource.array;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 20.11.2017
 */
public class Ex17 {
    public static void main(String[] args) {
        int[] a = {1, 20, 3, 6, 1, 2, 10, 9, 3, 11};
        int maxElement = a[0];
        int secondMaxElement = a[0];
        for (int i = 0; i < a.length; i++) {
            if (maxElement < a[i]) {
                secondMaxElement = maxElement;
                maxElement = a[i];
            }
            if (maxElement > a[i] && secondMaxElement < a[i])
                secondMaxElement = a[i];
        }
        System.out.println(maxElement);
        System.out.println(secondMaxElement);
    }
}
