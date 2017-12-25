package w3resource.methods;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 25.12.2017
 */
public class Ex3 {
    static String getMiddle(String str) {
        if (str.length() % 2 != 0)
            return str.substring(str.length() / 2, str.length() / 2 + 1);
        else return str.substring((str.length() / 2) - 1, str.length() / 2 + 1);
    }

    public static void main(String[] args) {
        String str = args[0];
        System.out.println(getMiddle(str));
    }
}
