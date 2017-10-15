package w3resource.basic;

/**
 * Created by Ross on 15.10.2017.
 */
public class Ex117 {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(25));
        System.out.println(sqrt(25));
    }

    public static int sqrt(int num) {
        if (num == 1 || num == 0) {
            return num;
        }
        int a = 0;
        int b = num;
        while (a <= b) {
            int mid = (a + b) >> 1;
            if (num / mid < mid) {
                b = mid - 1;
            } else {
                if (num / (mid + 1) <= mid) {
                    return mid;
                }
                a = mid + 1;
            }
        }
        return a;
    }
}
