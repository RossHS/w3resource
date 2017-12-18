package w3resource.dates;

import java.text.DateFormatSymbols;
import java.util.Locale;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 18.12.2017
 */
public class Ex12 {
    public static void main(String[] args) {
        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("ru"));
        String[] dayNames = symbols.getWeekdays();
        for (String s : dayNames) {
            System.out.print(s + "\n");
        }
    }
}
