package w3resource.basic;

/**
 * Created by Ross on 11.10.2017.
 */
public class Ex73 {
    private static String sub(String str1, String str2) {
        String str = "";
        str += str1.length() > 0 ? str1.charAt(0) : "#";
        str += str2.length() > 0 ? str2.charAt(str2.length()-1) : "#";
        return str;
    }

    public static void main(String[] args) {
        System.out.println(sub("", "1234"));
    }
}
