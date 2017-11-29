package w3resource.array;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 29.11.2017
 */
public class Ex32 {
    static boolean testAnArray(int[] a){
        for (int num: a){
            if(num != 65 && num!=77) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(testAnArray(new int[]{77,2,3}));
        System.out.println(testAnArray(new int[]{65,77,77,65,65}));
    }
}
