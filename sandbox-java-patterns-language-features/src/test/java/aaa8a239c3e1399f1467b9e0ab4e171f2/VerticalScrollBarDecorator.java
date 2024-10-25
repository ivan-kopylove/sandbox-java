package aaa8a239c3e1399f1467b9e0ab4e171f2;

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
