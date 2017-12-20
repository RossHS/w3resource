package w3resource.dates;

import java.util.Calendar;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 20.12.2017
 */
public class Ex18 {
    public static void isLeap(Calendar calendar) {
        if (calendar.getActualMaximum(Calendar.DAY_OF_YEAR) == 366) {
            System.out.println("Високосный год");
        } else System.out.println("Обычный год");
    }

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        isLeap(calendar);
        calendar.set(Calendar.YEAR,2016);
        System.out.println(calendar.getTime());
        isLeap(calendar);
    }
}
