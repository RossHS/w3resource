package w3resource.basic;

/**
 * Created by Ross on 10.10.2017.
 */
public class Ex56 {
    public static void weird(int rangeStart, int rangeEnd, int divNum) {
        for (int i = rangeStart; i <= rangeEnd; i++) {
            if (i % divNum == 0) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) {
        weird(1, 20, 3);
    }
}
