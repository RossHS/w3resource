package w3resource.basic;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex99 {
    public static void main(String[] args) {
        int[] num = {10, 20, 10, 30, 10, 50};
        boolean res = true;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] != 10 && num[i + 1] != 10) {
                res = false;
            }
        }
        System.out.println(res);
    }
}
