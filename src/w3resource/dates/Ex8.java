package w3resource.dates;

import java.util.Calendar;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 17.12.2017
 */
public class Ex8 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH,calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.getTime());
    }
}
