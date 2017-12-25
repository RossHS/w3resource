package w3resource.dates;

import java.util.Calendar;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 25.12.2017
 */
public class Ex22 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,-20);
        System.out.println(calendar.getTime());
    }
}
