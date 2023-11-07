package d21625d643764075b481f2af93d62eef;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Constructor is a way to set initial value(s) to an object.
 *
 * @author Ivan Kopylov
 */
public class ConsructorExamplesTest
{
    @Test
    public void runBottle()
    {
        Bottle bottle = new Bottle();
        bottle.initializeMyBottleWithMyCustomMethod(500, "Green", "Metal");

        Assertions.assertEquals(500, bottle.getMilliliters());
        Assertions.assertEquals("Green", bottle.getColor());
        Assertions.assertEquals("Metal", bottle.getMaterial());
    }

    @Test
    public void runFlask()
    {
        Flask flask = new Flask(500, "Green", "Metal");

        Assertions.assertEquals(500, flask.getMilliliters());
        Assertions.assertEquals("Green", flask.getColor());
        Assertions.assertEquals("Metal", flask.getMaterial());
    }

    @Test
    public void runFlaskWithSetters()
    {
        Bottle flask = new Bottle();

        flask.setColor("Green");
        flask.setMaterial("Metal");
        flask.setMilliliters(500);

        Assertions.assertEquals(500, flask.getMilliliters());
        Assertions.assertEquals("Green", flask.getColor());
        Assertions.assertEquals("Metal", flask.getMaterial());
    }
}