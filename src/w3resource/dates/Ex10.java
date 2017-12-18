package w3resource.dates;

import java.time.YearMonth;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 18.12.2017
 */
public class Ex10 {
    public static void main(String[] args) {
        YearMonth ym = YearMonth.of(2016, 9);

        String firstDay = ym.atDay(1).getDayOfWeek().name();
        String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
        System.out.println(firstDay);
        System.out.println(lastDay);
    }
}
