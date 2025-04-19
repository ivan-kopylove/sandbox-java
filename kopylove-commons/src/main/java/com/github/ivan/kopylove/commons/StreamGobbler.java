package com.github.ivan.kopylove.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamGobbler implements Runnable
{

    private static final Logger      LOGGER = LoggerFactory.getLogger(StreamGobbler.class);
    private final        InputStream inputStream;
    private final        String      name;
    private              int         lines  = 0;

    public StreamGobbler(InputStream inputStream, String name)
    {
        this.inputStream = inputStream;
        this.name = name;
    }

    @Override
    public void run()
    {
        try
        {
            InputStreamReader isr = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line = br.readLine()) != null)
            {
                LOGGER.info("line: {}", line);
                if (lines > 30)
                {
                    br.lines().forEach(LOGGER::info);
                    LOGGER.info("lines {}", lines);
                }
                lines++;
            }
        }
        catch (IOException e)
        {
            LOGGER.error("gobblger error", e);
        }
    }
}
