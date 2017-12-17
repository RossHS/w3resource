package w3resource.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 17.12.2017
 */
public class Ex9 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(calendar.getTime()));
        for (int i = 0; i < 6; i++) {
            calendar.add(Calendar.DATE, 1);
        }
        System.out.println(df.format(calendar.getTime()));
    }
}
