package eaab46cd7ce44438aed4782ceb0db725;

class WindowDecorator implements Window
{
    protected Window windowToBeDecorated;

    public WindowDecorator(Window windowToBeDecorated)
    {
        super();
        this.windowToBeDecorated = windowToBeDecorated;
    }

    public void draw()
    {
        windowToBeDecorated.draw(); // delegation
    }

    public String getDescription()
    {
        return windowToBeDecorated.getDescription(); // delegation
    }
}
