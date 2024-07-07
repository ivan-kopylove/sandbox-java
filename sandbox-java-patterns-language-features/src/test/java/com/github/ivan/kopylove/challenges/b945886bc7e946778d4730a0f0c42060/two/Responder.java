package com.github.ivan.kopylove.challenges.b945886bc7e946778d4730a0f0c42060.two;

// Someone interested in "Hello" events
class Responder implements HelloListener
{
    @Override
    public void someoneSaidHello()
    {
        System.out.println("Hello there...");
    }
}


