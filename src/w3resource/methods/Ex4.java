package w3resource.methods;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 25.12.2017
 */
public class Ex4 {
    static int getAllVowels(String str) {
        char[] vowels = "aeiou".toCharArray();
        char[] array = str.toLowerCase().toCharArray();
        int count = 0;
        for (char ar : array) {
            for (char v : vowels) {
                if (ar == v) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "aaebcdef";
        System.out.println(getAllVowels(str));
    }
}
