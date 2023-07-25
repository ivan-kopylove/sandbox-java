package com.github.ivan.kopylove.sandbox.jasper.embedded;

import net.sf.jasperreports.engine.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args)
    {

        try
        {
            JasperReport jasperReport = JasperCompileManager.compileReport("src\\main\\resources\\hello_world.jrxml");
            Map<String, Object> parameters = new HashMap<String, Object>();
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters);
            byte[] pdfBytes = JasperExportManager.exportReportToPdf(jasperPrint);
            try (FileOutputStream os = new FileOutputStream("1.pdf"))
            {
                os.write(pdfBytes);
            }
        }
        catch (JRException | FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
