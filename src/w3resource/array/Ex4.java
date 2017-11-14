package w3resource.array;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 14.11.2017
 */
public class Ex4 {
    static double getAverageOfArray(int... nums) {
        int result = 0;
        for (int aNum : nums) {
            result += aNum;
        }
        return (double) result / nums.length;
    }

    public static void main(String[] args) {
        System.out.println(getAverageOfArray(1, 2, 3, 4, 5, 6));
    }
}
