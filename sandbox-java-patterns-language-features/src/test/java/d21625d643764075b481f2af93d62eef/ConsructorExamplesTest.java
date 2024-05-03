package d21625d643764075b481f2af93d62eef;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Constructor is a way to set initial value(s) to an object.
 */
class ConsructorExamplesTest
{
    @Test
    void runBottle()
    {
        Bottle bottle = new Bottle();
        bottle.initializeMyBottleWithMyCustomMethod(500, "Green", "Metal");

        assertEquals(500, bottle.getMilliliters());
        assertEquals("Green", bottle.getColor());
        assertEquals("Metal", bottle.getMaterial());
    }

    @Test
    void runFlask()
    {
        Flask flask = new Flask(500, "Green", "Metal");

        assertEquals(500, flask.getMilliliters());
        assertEquals("Green", flask.getColor());
        assertEquals("Metal", flask.getMaterial());
    }

    @Test
    void runFlaskWithSetters()
    {
        Bottle flask = new Bottle();

        flask.setColor("Green");
        flask.setMaterial("Metal");
        flask.setMilliliters(500);

        assertEquals(500, flask.getMilliliters());
        assertEquals("Green", flask.getColor());
        assertEquals("Metal", flask.getMaterial());
    }
}