package w3resource.basic;

/**
 * Created by Ross on 11.10.2017.
 */
public class Ex72 {
    static String sub(String str) {
        return str.length() > 3 ? str.substring(0, 3) : "###";
    }

    public static void main(String[] args) {
        System.out.println(sub("1"));
        System.out.println(sub("1234"));
    }
}
