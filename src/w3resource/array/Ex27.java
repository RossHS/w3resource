package w3resource.array;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 27.11.2017
 */
public class Ex27 {
    public static void main(String[] args) {
        int[] ar = {5, 7, 2, 4, 9};
        int odd = 0;
        int even = 0;
        for (int anAr : ar) {
            if (anAr % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("odd number " + odd);
        System.out.println("even number " + even);
    }
}
