package b93a3f80423b4421955f90e3433aaacd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MainTest
{
    @Test
    void test1()
    {
        Dog aDog = new Dog("Max");
        test1_modify1(aDog);
        // aDog variable is still pointing to the "Max" dog
        assertEquals(aDog.getName(), "Max");
        assertNotEquals(aDog.getName(), "Fifi");
    }

    @Test
    void test2()
    {
        Dog aDog = new Dog("Max");
        test1_modify2(aDog);
        assertEquals(aDog.getName(), "Puppy");
    }

    @Test
    void test3()
    {
        Dog aDog = new Dog("Max");
        test1_modify3(aDog);
        assertEquals(aDog.getName(), "Puppy");
    }

    private void test1_modify1(Dog dog)
    {
        // change dog inside of foo() to point to a new Dog instance "Fifi"
        dog = new Dog("Fifi");
    }

    private void test1_modify2(Dog dog)
    {
        dog.setName("Puppy");
    }

    private void test1_modify3(Dog dog)
    {
        Dog dog1 = new Dog("Jack London");
        dog1 = dog;
        dog1.setName("Puppy");
    }
}