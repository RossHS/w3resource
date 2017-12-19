package w3resource.dates;

import java.util.Calendar;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 19.12.2017
 */
public class Ex15 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}
