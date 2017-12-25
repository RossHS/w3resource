package w3resource.methods;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 25.12.2017
 */
public class Ex5 {
    static int getNumberOfAllWords(String str) {
        String[] arr = str.split(" ");
        return arr.length;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        System.out.println(getNumberOfAllWords(str));
    }
}
