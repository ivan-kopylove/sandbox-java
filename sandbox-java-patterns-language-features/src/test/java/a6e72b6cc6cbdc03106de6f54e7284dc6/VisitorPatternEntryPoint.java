package a6e72b6cc6cbdc03106de6f54e7284dc6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

interface CarElement
{
    void accept(CarElementVisitor visitor);
}

interface CarElementVisitor
{
    void visit(Body body);

    void visit(Car car);

    void visit(Engine engine);

    void visit(Wheel wheel);
}

/**
 * <a href="https://en.wikipedia.org/wiki/Visitor_pattern">...</a>
 */
class VisitorPatternEntryPoint
{
    @Test
    void main()
    {
        Car car = new Car();

        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }
}

class Wheel implements CarElement
{
    private final String name;

    public Wheel(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void accept(CarElementVisitor visitor)
    {
        visitor.visit(this);
    }
}

class Body implements CarElement
{
    @Override
    public void accept(CarElementVisitor visitor)
    {
        visitor.visit(this);
    }
}

class Engine implements CarElement
{
    @Override
    public void accept(CarElementVisitor visitor)
    {
        visitor.visit(this);
    }
}

class Car implements CarElement
{
    private final List<CarElement> elements;

    public Car()
    {
        this.elements = Arrays.asList(new Wheel("front left"),
                                      new Wheel("front right"),
                                      new Wheel("back left"),
                                      new Wheel("back right"),
                                      new Body(),
                                      new Engine());
    }

    @Override
    public void accept(CarElementVisitor visitor)
    {
        for (CarElement element : elements)
        {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}

class CarElementDoVisitor implements CarElementVisitor
{
    @Override
    public void visit(Body body)
    {
        System.out.println("Moving my body");
    }

    @Override
    public void visit(Car car)
    {
        System.out.println("Starting my car");
    }

    @Override
    public void visit(Wheel wheel)
    {
        System.out.println("Kicking my " + wheel.getName() + " wheel");
    }

    @Override
    public void visit(Engine engine)
    {
        System.out.println("Starting my engine");
    }
}

class CarElementPrintVisitor implements CarElementVisitor
{
    @Override
    public void visit(Body body)
    {
        System.out.println("Visiting body");
    }

    @Override
    public void visit(Car car)
    {
        System.out.println("Visiting car");
    }

    @Override
    public void visit(Engine engine)
    {
        System.out.println("Visiting engine");
    }

    @Override
    public void visit(Wheel wheel)
    {
        System.out.println("Visiting " + wheel.getName() + " wheel");
    }
}


