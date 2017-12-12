package w3resource.string;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 12.12.2017
 */
public class Ex27 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        String newStr = str.substring(10,26);
        System.out.println(newStr);
    }
}

