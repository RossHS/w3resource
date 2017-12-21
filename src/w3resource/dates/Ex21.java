package w3resource.dates;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 21.12.2017
 */
public class Ex21 {
    public static void main(String[] args) {
        ZoneId.SHORT_IDS.keySet().
                stream().forEach(
                zoneKey -> System.out.println(" " + ZoneId.of(ZoneId.SHORT_IDS.get(zoneKey)) + ": "
                        + LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get(zoneKey)))));
    }
}
