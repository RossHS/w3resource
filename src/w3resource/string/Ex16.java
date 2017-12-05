package w3resource.string;

import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 05.12.2017
 */
public class Ex16 {
    public static void main(String[] args) {
        String str = "STRING";
        byte[] arr = str.getBytes();
        System.out.println(Arrays.toString(arr));
        String str1 = new String(arr);
        System.out.println(str1);
    }
}
