package w3resource.dates;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 16.12.2017
 */
public class Ex5 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println("Time in LA - " + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE)
                + ":" + calendar.get(Calendar.SECOND));
        System.out.println("Time in Moscow - " + calendar.getTime());
    }
}
