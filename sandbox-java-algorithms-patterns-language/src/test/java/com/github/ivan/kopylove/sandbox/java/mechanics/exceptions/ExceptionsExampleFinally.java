package com.github.ivan.kopylove.sandbox.java.mechanics.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ExceptionsExampleFinally
{
    @Test
    public void basicException()
    {

        BufferedReader br = null;
        try
        {
            File file = new File("non-existing file.");

            br = new BufferedReader(new FileReader(file));
            br.read();
        }
        catch (Exception e)
        {
            Assertions.assertTrue(true);
            System.out.println("Something bad happened.");
        }
        finally
        {
            Assertions.assertTrue(true);

            Assertions.assertTrue(true);
            System.out.println("Closing resource.");
            if (br != null)
            {
                System.out.println("Closed resource.");
                Assertions.fail();
            }
            else
            {
                Assertions.assertTrue(true);
                System.out.println("resource is null.");
            }
        }
    }
}
