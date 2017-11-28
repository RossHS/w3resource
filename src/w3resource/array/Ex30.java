package w3resource.array;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 28.11.2017
 */
public class Ex30 {
    public static <T extends Number> boolean testArray(T[] a){
        for (T num:a){
            if(num.equals(0) || num.equals(-1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(testArray(new Integer[]{1,2,3,4}));
        System.out.println(testArray(new Integer[]{1,0,3,4}));
    }
}
