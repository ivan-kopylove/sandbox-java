package heap.a79ce6794ff01ac615b5e58687745c938;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class LocalDateTimeTest
{
    @Test
    void happyPathLocalDateTime()
    {
        LocalDateTime result = LocalDateTime.parse("24.12.2020 14:58", DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
        assertEquals("2020-12-24T14:58", result.toString());
    }

    @Test
    void happyPathLocalDate()
    {
        LocalDate result = LocalDate.parse("24.12.2020", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        assertEquals("2020-12-24", result.toString());
    }

    @Test
    void localDateLenientBasicExample()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                                                       .withResolverStyle(ResolverStyle.LENIENT);

        LocalDate result = LocalDate.parse("31.02.2020", formatter);

        assertEquals("2020-03-02", result.toString());
    }

    @Test
    void localDateTimeLenient()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")
                                                       .withResolverStyle(ResolverStyle.LENIENT);

        LocalDateTime result = LocalDateTime.parse("18.02.2020 15:23", formatter);

        assertEquals("2020-02-18T15:23", result.toString());
    }

    @Test
    void localDateTimeStrict()
    {
        assertThrows(DateTimeParseException.class, () -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")
                                                           .withResolverStyle(ResolverStyle.STRICT);

            LocalDateTime.parse("18.02.2020 15:23", formatter);
        });
    }

    /**
     * {@link ResolverStyle.LENIENT} overflows myResultField.
     */
    @Test
    void localDateTimeLenientIncorrectDate()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")
                                                       .withResolverStyle(ResolverStyle.LENIENT);

        LocalDateTime result = LocalDateTime.parse("31.02.2020 15:23", formatter);

        assertEquals(2, result.getDayOfMonth());
        assertEquals(3, result.getMonthValue());
    }

    /**
     * {@link ResolverStyle.SMART} fixes myResultField to maximum available date.
     */
    @Test
    void localDateTimeSmartIncorrectDate()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")
                                                       .withResolverStyle(ResolverStyle.SMART);

        LocalDateTime result = LocalDateTime.parse("31.02.2020 15:23", formatter);

        assertEquals(29, result.getDayOfMonth());
        assertEquals(2, result.getMonthValue());
    }

    @Test
    void localDateStrict()
    {
        assertThrows(DateTimeParseException.class, () -> {

            String input = "31.02.2020";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                                                           .withResolverStyle(ResolverStyle.STRICT);

            LocalDate.parse(input, formatter);
        });
    }

    @Test
    void happyPathLocalTime()
    {
        LocalTime result = LocalTime.parse("23:55", DateTimeFormatter.ofPattern("HH:mm"));
        assertEquals("23:55", result.toString());
    }

    /**
     * Purpose: to show that java.util.Date differs from java.time.LocalDateTime .
     */
    @Test
    void dateDiffersFromLocalDateTime()
    {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 6, 15, 15, 15);
        long a = localDateTime.atZone(ZoneId.of("UTC+03:00"))
                              .toInstant()
                              .toEpochMilli();
        long b = localDateTime.atZone(ZoneId.of("UTC+02:00"))
                              .toInstant()
                              .toEpochMilli();

        assertEquals(3600000L, b - a);
        assertEquals(1592223300000L, a);
        assertEquals(1592226900000L, b);
    }

    /**
     * This example shows how to convert LocalDateTime to epoch milliseconds
     */
    @Test
    void localDateTimeToMillis()
    {
        LocalDateTime localDateTime = LocalDateTime.now();
        long a = localDateTime.atZone(ZoneId.systemDefault())
                              .toInstant()
                              .toEpochMilli();
        long b = new Date().getTime();

        if (b - a > 15)
        {
            fail();
        }
        assertTrue(true);
    }

    @Test
    void unableToParse()
    {
        assertThrows(DateTimeParseException.class, () -> {

            DateTimeFormatter.ofPattern("YY")
                             .format(LocalDateTime.now());
            LocalDateTime.parse("24.12.2020", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        });
    }

    /**
     * LocalDate is not suited to parse Date and time. Only date.
     */
    @Test
    void unableToParseDateTime()
    {
        assertThrows(UnsupportedOperationException.class, () -> {
            List<Object> objects = Collections.emptyList();
            objects.add("dsa");
        });

        assertThrows(DateTimeParseException.class, () -> {
            LocalDate.parse("24.12.2020 14:58", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        });
    }

    @Test
    void zonedDateTimeExample()
    {
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2011-12-03T10:15:30+01:00");
    }

    @Test
    void noErrorIfUseLocalDateTime()
    {
        LocalDateTime.parse("24.12.2020 14:58", DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
    }

    @Test
    void dle()
    {
        LocalDateTime localDateTime = LocalDateTime.now();
        String format = localDateTime.format(DateTimeFormatter.ofPattern("d/m/yyyy HH:MM"));

        long a = localDateTime.atZone(ZoneId.systemDefault())
                              .toInstant()
                              .toEpochMilli();
        long b = new Date().getTime();

        if (b - a > 5)
        {
            fail();
        }
        assertTrue(true);
    }

    /**
     * To show that same timezone has many aliases.
     */
    @Test
    void timeZoneHasAliases()
    {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 6, 15, 15, 15);
        long a = localDateTime.atZone(ZoneId.of("Europe/Moscow"))
                              .toInstant()
                              .toEpochMilli();
        long b = localDateTime.atZone(ZoneId.of("Europe/Helsinki"))
                              .toInstant()
                              .toEpochMilli();
        long c = localDateTime.atZone(ZoneId.of("Asia/Beirut"))
                              .toInstant()
                              .toEpochMilli();
        assertEquals(a, b);
        assertEquals(a, c);
    }

    @Test
    void test3()
    {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 6, 15, 15, 15);
        long a = localDateTime.atZone(ZoneId.of("Europe/Moscow"))
                              .toInstant()
                              .toEpochMilli();
        long b = localDateTime.atZone(ZoneId.of("Africa/Cairo"))
                              .toInstant()
                              .toEpochMilli();

        assertEquals(3600000L, b - a);
    }
}
