package w3resource.basic;

import java.nio.charset.Charset;

/**
 * Created by Ross on 09.10.2017.
 */
public class Ex40 {
    public static void main(String[] args) {
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
}
