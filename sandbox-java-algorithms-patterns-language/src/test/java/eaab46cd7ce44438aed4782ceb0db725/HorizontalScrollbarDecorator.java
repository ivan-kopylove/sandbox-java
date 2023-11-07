package eaab46cd7ce44438aed4782ceb0db725;

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
