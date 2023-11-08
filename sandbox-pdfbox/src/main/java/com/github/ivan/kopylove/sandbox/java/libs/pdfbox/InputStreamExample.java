package com.github.ivan.kopylove.sandbox.java.libs.pdfbox;

import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample
{
    public static void main(String[] args)
    {
        File folder = new File(".");
        for (File file : folder.listFiles())
        {
            byte[] barray = new byte[0];
            try
            {
                InputStream is = new FileInputStream(file);
                barray = readFully(is);
                if (!validatePDF(barray))
                {
                    System.out.printf("[FAILED] %s%n", file);
                }
                else
                {
                    System.out.printf("[OK] %s%n", file);
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static byte[] readFully(InputStream stream) throws IOException
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

    /**
     * Check if provided file is PDF
     *
     * @param data - file as byte array
     * @return true in case of provided file data is PDF
     */
    public static boolean validatePDF(byte[] data)
    {
        try
        {
            PDDocument.load(data)
                      .close();
        }
        catch (Exception ex)
        {
            return false;
        }
        return true;
    }
}
