package w3resource.dates;

import java.time.LocalTime;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 19.12.2017
 */
public class Ex13 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.plusHours(2));
    }
}
