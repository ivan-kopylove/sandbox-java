package afa41a17020dc54185ac37e2b2a62c4d4;

/**
 * No constuctor means "default constuctor".
 */
class Bottle
{
    private int    milliliters;
    private String color;
    private String material;

    public void initializeMyBottleWithMyCustomMethod(int milliliters, String color, String material)
    {
        this.milliliters = milliliters;
        this.color = color;
        this.material = material;
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

    public int getMilliliters()
    {
        return milliliters;
    }

    public void setMilliliters(int milliliters)
    {
        this.milliliters = milliliters;
    }
}

