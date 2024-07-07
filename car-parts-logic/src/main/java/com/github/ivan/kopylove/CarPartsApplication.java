package com.github.ivan.kopylove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootApplication
public class CarPartsApplication
{

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException
    {
        System.setProperty("CAR_PARTS_TELEGRAM_BOT_DEV_MODE", "true");

        ConfigurableApplicationContext run = SpringApplication.run(CarPartsApplication.class, args);
        BotStarter bean = run.getBean(BotStarter.class);
        bean.start();
    }
}
