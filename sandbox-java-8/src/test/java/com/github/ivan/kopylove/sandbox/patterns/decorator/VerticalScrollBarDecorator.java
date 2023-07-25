package com.github.ivan.kopylove.sandbox.patterns.decorator;

class VerticalScrollBarDecorator extends WindowDecorator
{
    public VerticalScrollBarDecorator(Window windowToBeDecorated)
    {
        super(windowToBeDecorated);
    }

    @Override
    public void draw()
    {
        super.draw();
        drawVerticalScrollbar();
    }

    private void drawVerticalScrollbar()
    {
        // draw the vertical scroll bar
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + ", including vertical scrollbars";
    }
}
