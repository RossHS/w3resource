package w3resource.basic;

/**
 * Created by Ross on 09.10.2017.
 */
public class Ex48 {
    public static void oddNum(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        oddNum(1, 99);
    }
}
