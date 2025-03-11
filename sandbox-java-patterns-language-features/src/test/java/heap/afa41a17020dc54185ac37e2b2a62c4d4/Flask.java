package heap.afa41a17020dc54185ac37e2b2a62c4d4;

class Flask
{
    private int    milliliters;
    private String color;
    private String material;

    /**
     * Constructor<br/>
     * 1. Mandatory method - guarantess that object is initialized to work with.<br/>
     * 2. Same as the class name.<br/>
     * 3. Allocates memory.<br/>
     * 4. No return arg.
     */
    public Flask(int milliliters, String color, String material)
    {
        this.milliliters = milliliters;
        this.color = color;
        this.material = material;
    }

    public int getMilliliters()
    {
        return milliliters;
    }

    public void setMilliliters(int milliliters)
    {
        this.milliliters = milliliters;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }
}
