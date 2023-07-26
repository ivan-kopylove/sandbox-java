package com.github.ivan.kopylove.sandbox.java.libs;

import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSinglePdfTest
{
    private static byte[] readPdf()
    {
        try
        {
            return Files.readAllBytes(Paths.get("src\\main\\resources\\1.4 (acrobat 5.x) medium.pdf"));
        }
        catch (IOException e)
        {
            return new byte[0];
        }
    }

    @Test
    public void a()
    {
        byte[] result = new byte[0];

        byte[] pdf = readPdf();

        PDFMergerUtility ut = new PDFMergerUtility();

        ut.addSource(new ByteArrayInputStream(pdf));
        ByteArrayOutputStream mergedData = new ByteArrayOutputStream();
        ut.setDestinationStream(mergedData);
        try
        {
            ut.mergeDocuments(null);
            result = mergedData.toByteArray();
            Files.write(Paths.get("src\\main\\resources\\1.4 (acrobat 5.x) medium-merged.pdf"), result);
            System.out.println("1");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        assertArrayEquals(pdf, result);
    }
}