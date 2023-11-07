package d21625d643764075b481f2af93d62eef;

/**
 * No constuctor means "default constuctor".
 *
 * @author Ivan Kopylov
 */
public class Bottle
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

