package w3resource.dates;

import java.util.Calendar;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 14.12.2017
 */
public class Ex1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int year = 2018;
        int month = 1;
        int day = 10;

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        System.out.println(calendar.getTime());
    }
}
