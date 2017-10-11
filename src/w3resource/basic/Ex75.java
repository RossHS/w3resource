package w3resource.basic;

/**
 * Created by Ross on 11.10.2017.
 */
public class Ex75 {
    public static void main(String[] args) {
        int[] num_array = {50, -20, 0, 30, 40, 60, 10};

        System.out.println (num_array.length >= 1 && num_array[0] ==  num_array[num_array.length-1]);
    }
}
