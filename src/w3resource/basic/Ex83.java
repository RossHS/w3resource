package w3resource.basic;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex83 {
    public static void main(String[] args) {
        int[] arr1 = {-1,2,3,-5, 5};
        int[] arr2 = {-1,4,2,0};

        try {
            for (int i = 0; i < arr1.length ; i++) {
                int num = arr1[i] * arr2[i];
                System.out.print(num + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
