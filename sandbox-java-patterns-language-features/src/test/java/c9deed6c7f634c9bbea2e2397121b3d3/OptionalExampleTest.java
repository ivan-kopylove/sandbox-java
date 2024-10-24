package c9deed6c7f634c9bbea2e2397121b3d3;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 * https://www.baeldung.com/java-optional
 * Optional as a single-value container that either contains a value or doesn't (it is then said to be "empty").
 * Optional is a class that encapsulates an optional value.
 * Optional should help us to avoid such unforeseen exceptions
 *
 */
class OptionalExampleTest
{
    @Test
    void givenNonNull_whenCreatesNonNullable_thenCorrect()
    {
        String name = "baeldung";
        Optional.of(name);
    }

    @Test
    void givenNonNull_whenCreatesOptional_thenCorrect()
    {
        String name = "baeldung";
        Optional<String> opt = Optional.of(name);
        assertEquals("Optional[baeldung]", opt.toString());
    }

    @Test
    void givenNull_whenThrowsErrorOnCreate_thenCorrect()
    {
        assertThrows(NullPointerException.class, () -> {

            String name = null;
            Optional<String> opt = Optional.of(name);
        });
    }

    @Test
    void givenNonNull_whenCreatesNullable_thenCorrect()
    {
        String name = "baeldung";
        Optional<String> opt = Optional.ofNullable(name);
        assertEquals("Optional[baeldung]", opt.toString());
    }

    @Test
    void givenNull_whenCreatesNullable_thenCorrect()
    {
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        assertEquals("Optional.empty", opt.toString());
    }

    @Test
    void givenOptional_whenIsPresentWorks_thenCorrect()
    {
        Optional<String> opt = Optional.of("Baeldung");
        assertTrue(opt.isPresent());

        opt = Optional.ofNullable(null);
        assertFalse(opt.isPresent());
    }

    @Test
    void whenOrElseWorks_thenCorrect()
    {
        String nullName = null;
        String name = Optional.ofNullable(nullName)
                              .orElse("john");
        assertEquals("john", name);
    }

    @Test
    void givenOptional_whenIfPresentWorks_thenCorrect()
    {
        Optional<String> opt = Optional.of("baeldung");

        opt.ifPresent(name -> System.out.println(name.length()));
    }

    @Test
    void whenOrElseGetWorks_thenCorrect()
    {
        String nullName = null;
        String name = Optional.ofNullable(nullName)
                              .orElseGet(() -> {
                                  System.out.println("orElseGetCalled");
                                  return "john";
                              });
        assertEquals("john", name);
    }

    public String getMyDefault()
    {
        System.out.println("Getting Default Value");
        return "Default Value";
    }

    //@Test
    void whenOrElseGetAndOrElseOverlap_thenCorrect()
    {
        String text = null;

        System.out.println("Using orElseGet:");
        String defaultText = Optional.ofNullable(text)
                                     .orElseGet(this::getMyDefault);
        assertEquals("Default Value", defaultText);

        System.out.println("Using orElse:");
        defaultText = Optional.ofNullable(text)
                              .orElse(getMyDefault());
        assertEquals("Default Value", defaultText);
    }

    @Test
    void whenOrElseGetAndOrElseDiffer_thenCorrect()
    {
        String text = "Text present";

        System.out.println("Using orElseGet:");
        String defaultText = Optional.ofNullable(text)
                                     .orElseGet(this::getMyDefault);
        assertEquals("Text present", defaultText);

        System.out.println("Using orElse:");
        defaultText = Optional.ofNullable(text)
                              .orElse(getMyDefault());
        assertEquals("Text present", defaultText);
    }

    @Test
    void whenOrElseThrowWorks_thenCorrect()
    {
        assertThrows(IllegalArgumentException.class, () -> {

            String nullName = null;
            String name = Optional.ofNullable(nullName)
                                  .orElseThrow(IllegalArgumentException::new);
        });
    }

    @Test
    void givenOptional_whenGetsValue_thenCorrect()
    {
        Optional<String> opt = Optional.of("baeldung");
        String name = opt.get();

        assertEquals("baeldung", name);
    }

    @Test
    void givenOptionalWithNull_whenGetThrowsException_thenCorrect()
    {
        assertThrows(NoSuchElementException.class, () -> {

            Optional<String> opt = Optional.ofNullable(null);
            String name = opt.get();
        });
    }
}
