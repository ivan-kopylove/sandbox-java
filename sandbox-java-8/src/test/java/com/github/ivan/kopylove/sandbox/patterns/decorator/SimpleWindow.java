package com.github.ivan.kopylove.sandbox.patterns.decorator;

//Implementation of a simple Window without any scrollbars
class SimpleWindow implements Window
{
    public void draw()
    {
        // draw window
    }

    public String getDescription()
    {
        return "simple window";
    }
}