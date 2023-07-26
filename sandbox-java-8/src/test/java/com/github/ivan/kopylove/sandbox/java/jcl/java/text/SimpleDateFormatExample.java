package com.github.ivan.kopylove.sandbox.java.jcl.java.text;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleDateFormatExample
{
    @Test
    public void main() throws ParseException
    {
        String strDT = "2017-02-14T00:02:18".replaceAll("Z$", "+0000");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date = format.parse(strDT);

        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        String result = format2.format(date);

        Assertions.assertEquals("2017-02-14", result);
    }

    @Test
    public void setLenientFalse()
    {
        assertThrows(ParseException.class, () -> {

            SimpleDateFormat ddMMyyyy = new SimpleDateFormat("ddMMyyyy");
            ddMMyyyy.setLenient(false);
            ddMMyyyy.parse("31022020");
        });
    }

    @Test
    public void setLenientTrueOverflowedDate() throws ParseException
    {
        SimpleDateFormat ddMMyyyy = new SimpleDateFormat("ddMMyyyy");
        ddMMyyyy.setLenient(true);
        Date result = ddMMyyyy.parse("31022020");
        Assertions.assertEquals(2, result.getMonth());
        Assertions.assertEquals(2, result.getDate());
    }

    @Test
    public void setLenientTrueValidDate() throws ParseException
    {
        SimpleDateFormat ddMMyyyy = new SimpleDateFormat("ddMMyyyy");
        ddMMyyyy.setLenient(true);
        Date result = ddMMyyyy.parse("28022020");
        Assertions.assertEquals(1, result.getMonth());
        Assertions.assertEquals(28, result.getDate());
    }

    @Test
    public void happyPath01() throws ParseException
    {
        String input = "23.12.2020";
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date result = format.parse(input);

        Assertions.assertEquals(23, result.getDate());
        Assertions.assertEquals(11, result.getMonth());
    }

    @Test
    public void happyPath02() throws ParseException
    {
        String input = "23:59";
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date result = format.parse(input);

        Assertions.assertNotNull(result);
    }
}
