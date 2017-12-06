package w3resource.string;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 06.12.2017
 */
public class Ex20 {
    public static void main(String[] args) {
        String str = "Java Rules";
        String stringBuilder = new StringBuilder("Java").append(" Rules").toString();
        String str2 = stringBuilder.intern();
        System.out.println(str == stringBuilder);
        System.out.println(str == str2);
    }
}
