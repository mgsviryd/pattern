package com.test;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class AppTest {
    @Test
    public void test() {
        LocalDateTime ldt = LocalDateTime.of(2017, 06, 02, 6, 0, 0); //Jun 2nd, 6AM.
        ZoneOffset nyOffset = ZoneOffset.ofHoursMinutes(-5, 0);
        ZoneId nyZone = ZoneId.of("America/New_York");
        OffsetDateTime nyOdt = ldt.atOffset(nyOffset);
        ZonedDateTime nyZdt = ldt.atZone(nyZone);
        Duration d = Duration.between(nyOdt, nyZdt);
        System.out.println(d);
        System.out.println(nyOdt);
        System.out.println(nyZdt);
    }
}
