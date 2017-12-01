package w3resource.string;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 01.12.2017
 */
public class Ex2 {
    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(str.charAt(0) + " " + str.codePointAt(0));
        System.out.println(str.charAt(2) + " " + str.codePointAt(2));
    }
}
