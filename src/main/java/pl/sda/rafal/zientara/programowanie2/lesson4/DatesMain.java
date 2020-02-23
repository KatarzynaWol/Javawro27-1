package pl.sda.rafal.zientara.programowanie2.lesson4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DatesMain {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        final ZonedDateTime zonedDateTime = ZonedDateTime.now();
        final LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(now);
        System.out.println(zonedDateTime);
        System.out.println(localDateTime);
        System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("Canada/Atlantic")));
        Set<String> allZones= ZoneId.getAvailableZoneIds();
        for(String zone:allZones){
            System.out.println(zone);
        }
    }
}
