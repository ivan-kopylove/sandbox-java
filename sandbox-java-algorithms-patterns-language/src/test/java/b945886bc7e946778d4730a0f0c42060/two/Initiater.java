package com.github.ivan.kopylove.challenges.b945886bc7e946778d4730a0f0c42060.two;

import java.util.ArrayList;
import java.util.List;

// Someone who says "Hello"
class Initiater
{
    private final List<com.github.ivan.kopylove.challenges.b945886bc7e946778d4730a0f0c42060.two.HelloListener> listeners = new ArrayList<>();

    public void addListener(com.github.ivan.kopylove.challenges.b945886bc7e946778d4730a0f0c42060.two.HelloListener toAdd)
    {
        listeners.add(toAdd);
    }

    public void sayHello()
    {
        System.out.println("Hello!!");

        // Notify everybody that may be interested.
        for (com.github.ivan.kopylove.challenges.b945886bc7e946778d4730a0f0c42060.two.HelloListener hl : listeners)
        {
            hl.someoneSaidHello();
        }
    }
}