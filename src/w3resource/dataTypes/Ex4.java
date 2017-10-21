package w3resource.dataTypes;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Ross on 21.10.2017.
 */
public class Ex4 {
    public static void main(String[] args) {
        Calendar dating = Calendar.getInstance();
        long milSec = (long) 3456789 * 60000;
        dating.setTimeInMillis(milSec);
        SimpleDateFormat formating = new SimpleDateFormat("dd MMM YYY");
        System.out.println(formating.format(dating.getTime()));

        int min = 3456789;
        double minutesInYear = 60 * 24 * 365;
        long years = (long) (min / minutesInYear);
        int days = (min / 60 / 24) % 365;

        System.out.println(min + " минут соответсвует " + days + " дням и " + years + " годам");
    }
}
