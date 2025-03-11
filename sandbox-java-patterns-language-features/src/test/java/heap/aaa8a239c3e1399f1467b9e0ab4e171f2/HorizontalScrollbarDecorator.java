package heap.aaa8a239c3e1399f1467b9e0ab4e171f2;

class HorizontalScrollbarDecorator extends WindowDecorator
{

    public HorizontalScrollbarDecorator(Window windowToBeDecorated)
    {
        super(windowToBeDecorated);
    }

    @Override
    public void draw()
    {
        super.draw();
        drawHorizontalScrollbar();
    }

    private void drawHorizontalScrollbar()
    {
        // draw the horizontal scrollbar
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + ", including horizontal scrollbars";
    }
}
