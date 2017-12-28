package w3resource.methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 28.12.2017
 */
public class Ex11 {
    public static boolean passwordIsValid(String str){
        Pattern pattern = Pattern.compile("^(?=.*\\d).{2,}(?=.*[a-zA-Z]).{8,}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
