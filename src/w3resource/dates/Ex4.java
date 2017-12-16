package w3resource.dates;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 16.12.2017
 */
public class Ex4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(new Date());
        System.out.println(calendar.getActualMinimum(Calendar.YEAR));
    }
}
