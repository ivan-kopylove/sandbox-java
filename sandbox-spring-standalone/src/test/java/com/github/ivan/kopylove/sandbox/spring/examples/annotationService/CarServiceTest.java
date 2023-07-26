package com.github.ivan.kopylove.sandbox.spring.examples.annotationService;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarServiceTest
{
    @Test
    public void run()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        CarService carService = ctx.getBean(CarService.class);
        String car = carService.getCar();
        assertEquals("BMW", car);
    }
}