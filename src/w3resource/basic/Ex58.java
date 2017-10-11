package w3resource.basic;

/**
 * Created by Ross on 11.10.2017.
 */
public class Ex58 {
    public static String capString(String str) {
        String strNew = "";
        boolean space = true;
        for (int i = 0; i < str.length(); i++) {
            if (space) {
                strNew += Character.toUpperCase(str.charAt(i));
                space = false;
            } else {
                strNew += str.charAt(i);
                if (str.charAt(i) == ' ') {
                    space = true;
                }
            }
        }
        return strNew;
    }

    public static String toTitleCase(String givenString) {
        String[] arr = givenString.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String str = "julia like you";
        System.out.println(str);
        System.out.println(capString(str));
        System.out.println(toTitleCase(str));

    }
}
