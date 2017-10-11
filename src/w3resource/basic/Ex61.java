package w3resource.basic;

/**
 * Created by Ross on 11.10.2017.
 */
public class Ex61 {
    public static String reverse(String str) {
        StringBuilder temp = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            temp.append(str.charAt(i));
        }
        return String.valueOf(temp);
    }

    public static void main(String[] args) {
        System.out.println(reverse("abcd1234"));
    }
}
