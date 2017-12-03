package w3resource.string;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 03.12.2017
 */
public class Ex9 {
    public static void main(String[] args) {
        String str = "ABC", str1 = "ABc", str2 = "ABC";
        StringBuilder strb = new StringBuilder("ABC");
        System.out.println(str.contentEquals(str1));
        System.out.println(str.contentEquals(str2));
        System.out.println(str.equals(strb));
        System.out.println(str.contentEquals(strb));
    }
}
