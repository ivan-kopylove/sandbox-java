package com.github.ivan.kopylove.sandbox.patterns.listener.two;

// Someone interested in "Hello" events
class Responder implements HelloListener
{
    @Override
    public void someoneSaidHello()
    {
        System.out.println("Hello there...");
    }
}


