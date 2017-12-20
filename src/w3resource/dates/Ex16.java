package w3resource.dates;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 20.12.2017
 */
public class Ex16 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR, 14);
        Date newDate = calendar.getTime();
        System.out.println(date);
        System.out.println(newDate);
    }
}
