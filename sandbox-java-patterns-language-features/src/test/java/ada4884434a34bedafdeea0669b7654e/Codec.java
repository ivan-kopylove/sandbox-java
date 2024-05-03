package com.github.ivan.kopylove.challenges.ada4884434a34bedafdeea0669b7654e;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * <a href="https://leetcode.com/problems/encode-and-decode-tinyurl/submissions/996749611/">535. Encode and Decode TinyURL</a>
 */
public class Codec
{

    private static final String              PREFIX      = "http://tinyurl.com/";
    private static final Map<String, String> shortToLong = new HashMap<>(); //imitates an index on a db column
    private static final Map<String, String> longToShort = new HashMap<>(); //imitates an index on a db column

    public String encode(String longUrl)
    {
        String existing = longToShort.get(longUrl);
        if (existing != null)
        {
            return PREFIX + shortToLong.get(existing);
        }

        String randomString = UUID.randomUUID()
                                  .toString()
                                  .split("-")[0].toLowerCase();

        for (int i = 0; shortToLong.get(randomString) != null; i++)
        {
            randomString = UUID.randomUUID()
                               .toString()
                               .split("-")[0].toLowerCase();
            if (i > 9)
            {
                // alert to monitoring system it is time to extend the length of a random key OR update random string alrorythm
            }
        }

        shortToLong.put(randomString, longUrl);
        longToShort.put(longUrl, randomString);

        return PREFIX + randomString;
    }

    public String decode(String shortUrl)
    {
        String key = shortUrl.split("/")[3];
        String longUrl = shortToLong.get(key);
        if (longUrl == null)
        {
            throw new RuntimeException("no mapping for key" + key);
        }
        return longUrl;
    }
}