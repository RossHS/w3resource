package w3resource.array;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 14.11.2017
 */
public class Ex2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int sum = 0;
        for (int s : nums) {
            sum += s;
        }
        System.out.println("Сумма массива равна" + sum);
    }
}
