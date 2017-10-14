package w3resource.basic;

/**
 * Created by Ross on 14.10.2017.
 */
public class Ex110 {
    static boolean isPowOf4(int num) {
        boolean bool = true;
        while (num != 1) {
            if (num % 4 != 0) {
                bool = false;
                break;
            }
            num /= 4;
        }
        return bool;
    }

    public static void main(String[] args) {
        System.out.println(isPowOf4(64));
        System.out.println(isPowOf4(6));
    }
}
