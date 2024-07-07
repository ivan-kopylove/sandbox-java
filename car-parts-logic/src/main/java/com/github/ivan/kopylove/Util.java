package com.github.ivan.kopylove;

public class Util
{
    public static String getTelegramApiKey()
    {
        if ("true".equals(System.getenv("CAR_PARTS_TELEGRAM_BOT_DEV_MODE")))
        {
            return "devModeKey";
        }

        String devKey = System.getenv("CAR_PARTS_TELEGRAM_BOT_DEV");
        if (!devKey.isBlank())
        {
            return devKey;
        }
        String prodKey = System.getenv("CAR_PARTS_TELEGRAM_BOT_PROD");
        if (!prodKey.isBlank())
        {
            return prodKey;
        }
        throw new RuntimeException("Invalid configuration");
    }
}
