package w3resource.string;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 10.12.2017
 */
public class Ex24 {
    public static void main(String[] args) {
        String str = "ABCDAFD  dD";
        String str1 = str.replace('D','A').replace('d','a');
        System.out.println(str1);
    }
}
