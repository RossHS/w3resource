package w3resource.dataTypes;

/**
 * Created by Ross on 03.11.2017.
 */
public class Ex10 {
    public static void main(String[] args) {
        int a = 123456;
        while (a != 0) {
            System.out.print(a % 10 + " ");
            a /= 10;
        }
    }
}
