package aaa8a239c3e1399f1467b9e0ab4e171f2;

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
