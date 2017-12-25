package w3resource.dates;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 25.12.2017
 */
public class Ex23 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        Period period = today.until(lastDayOfYear);
        System.out.println();
        System.out.println("Months remaining in the year: "+period.getMonths());
        System.out.println();
    }
}
