package w3resource.dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 21.12.2017
 */
public class Ex19 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate userDate = LocalDate.of(2015, Month.MAY, 15);
        Period diff = Period.between(userDate, today);
        System.out.println("\nDifference between " + userDate + " and " + today + ": "
                + diff.getYears() + " Year(s) and " + diff.getMonths() + " Month()s\n");

    }
}
