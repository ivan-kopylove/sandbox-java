package com.github.ivan.kopylove.sandbox.java.jcl.java.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ReadToByteArray
{
    private static byte[] readFully(InputStream stream) throws IOException
    {
        byte[] buffer = new byte[8192];
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        int bytesRead;
        while ((bytesRead = stream.read(buffer)) != -1)
        {
            baos.write(buffer, 0, bytesRead);
        }
        return baos.toByteArray();
    }

    @Test
    public void main() throws IOException
    {
        URL resource = ReadToByteArray.class.getClassLoader()
                                            .getResource("cameleon-transition.svg.pdf");
        if (resource != null)
        {
            InputStream inputStream = null;
            try
            {
                inputStream = new FileInputStream(resource.getFile());
                byte[] b = readFully(inputStream);
                System.out.println(b.length);
                Assertions.assertEquals(35347, b.length);
            }
            finally
            {
                if (inputStream != null)
                {
                    inputStream.close();
                }
            }
        }
        else
        {
            Assertions.fail();
        }
    }
}
