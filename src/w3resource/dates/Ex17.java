package w3resource.dates;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 20.12.2017
 */
public class Ex17 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date1 = calendar.getTime();
        calendar.add(Calendar.YEAR, 1);
        Date date2 = calendar.getTime();
        calendar.add(Calendar.YEAR, -2);
        Date date3 = calendar.getTime();

        System.out.println(date1 + "\n" + date2 + "\n" + date3);

    }
}
