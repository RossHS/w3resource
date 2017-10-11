package w3resource.basic;

/**
 * Created by Ross on 11.10.2017.
 */
public class Ex57 {
    public static int countFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countFactors(12));
    }
}
