package w3resource.string;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 03.12.2017
 */
public class Ex10 {
    public static void main(String[] args) {
        StringBuffer sBuf = new StringBuffer("ABCD");
        StringBuffer sBuf1 = new StringBuffer("ABCd");
        String str = "ABCD";
        System.out.println(str.contentEquals(sBuf));
        System.out.println(str.contentEquals(sBuf1));

    }
}
