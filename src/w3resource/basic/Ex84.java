package w3resource.basic;

/**
 * Created by Ross on 13.10.2017.
 */
public class Ex84 {
    static String test(String str1, String str2) {
        return str2.substring(0, 2) + str1.substring(3, str1.length() - 3) + str2.substring(0, 2);
    }

    public static void main(String[] args) {
        String str1 = "JavaJavaJava";
        String str2 = "TEST";
        System.out.println(test(str1, str2));
    }
}
