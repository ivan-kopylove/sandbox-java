package com.github.ivan.kopylove;

import com.github.ivan.kopylove.telegram.api.client.TelegramClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import static com.github.ivan.kopylove.Util.getTelegramApiKey;

@Configuration
public class AppConfig
{

    @Bean
    @DependsOn({"fileReader", "fileWriter"})

    public TelegramClient telegramClient()
    {
        return TelegramClient.telegramClient(getTelegramApiKey());
    }
}