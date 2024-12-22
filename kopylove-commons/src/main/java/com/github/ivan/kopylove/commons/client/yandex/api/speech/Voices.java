package com.github.lazyf1sh.api.yandex;

import java.util.HashMap;
import java.util.Map;

public final class Voices
{

    private Voices() {}

    public static Map<String, String> philip()
    {
        Map<String, String> body = new HashMap<>();
        body.put("lang", "ru-RU");
        body.put("voice", "filipp");
        return body;
    }

    public static Map<String, String> alena()
    {
        Map<String, String> body = new HashMap<>();
        body.put("lang", "ru-RU");
        body.put("voice", "alena");
        return body;
    }

    public static Map<String, String> madirus()
    {
        Map<String, String> body = new HashMap<>();
        body.put("lang", "ru-RU");
        body.put("voice", "madirus");
        return body;
    }

    public static Map<String, String> zahar()
    {
        Map<String, String> body = new HashMap<>();
        body.put("lang", "ru-RU");
        body.put("voice", "zahar");
        return body;
    }

    public static Map<String, String> omazh()
    {
        Map<String, String> body = new HashMap<>();
        body.put("lang", "ru-RU");
        body.put("voice", "omazh");
        return body;
    }

    public static Map<String, String> jane()
    {
        Map<String, String> body = new HashMap<>();
        body.put("lang", "ru-RU");
        body.put("voice", "jane");
        return body;
    }

    public static Map<String, String> ermil()
    {
        Map<String, String> body = new HashMap<>();
        body.put("lang", "ru-RU");
        body.put("voice", "ermil");
        return body;
    }

    public static Map<String, String> john()
    {
        Map<String, String> body = new HashMap<>();
        body.put("lang", "en-US");
        body.put("voice", "john");
        return body;
    }
}

