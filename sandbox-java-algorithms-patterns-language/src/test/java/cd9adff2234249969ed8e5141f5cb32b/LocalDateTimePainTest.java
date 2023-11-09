package cd9adff2234249969ed8e5141f5cb32b;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

import static org.junit.jupiter.api.Assertions.assertThrows;

class LocalDateTimePainTest
{
    @Test
    void uuuu()
    {
        DateTimeFormatter uuuu = DateTimeFormatter.ofPattern("ddMMuuuu")
                                                  .withResolverStyle(ResolverStyle.STRICT);

        LocalDate.parse("28022020", uuuu);
    }

    @Test
    void yyyy()
    {
        assertThrows(DateTimeParseException.class, () -> {


            DateTimeFormatter yyyy = DateTimeFormatter.ofPattern("ddMMyyyy")
                                                      .withResolverStyle(ResolverStyle.STRICT);

            LocalDate.parse("28022020", yyyy);
        });
    }

    @Test
    void uuuuDateTime()
    {
        DateTimeFormatter yyyy = DateTimeFormatter.ofPattern("ddMMuuuu HH:mm")
                                                  .withResolverStyle(ResolverStyle.STRICT);

        LocalDateTime.parse("28022020 15:23", yyyy);
    }
}
