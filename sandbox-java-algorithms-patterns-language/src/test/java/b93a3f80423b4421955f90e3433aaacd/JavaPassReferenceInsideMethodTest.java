package com.github.ivan.kopylove.challenges.b93a3f80423b4421955f90e3433aaacd;

import org.junit.jupiter.api.Test;

/**
 * facets:
 * - basic-mechanism
 * questions:
 * - what is passed actually?
 */
class JavaPassReferenceInsideMethodTest
{
    @Test
    void test1()
    {
        com.github.ivan.kopylove.challenges.b93a3f80423b4421955f90e3433aaacd.Dog aDog = new com.github.ivan.kopylove.challenges.b93a3f80423b4421955f90e3433aaacd.Dog("Max");
        createNewInstanceInside(aDog);
        // aDog variable is still pointing to the "Max" dog
        assertEquals(aDog.getName(), "Max");
        assertNotEquals(aDog.getName(), "Fifi");
    }

    @Test
    void test2()
    {
        com.github.ivan.kopylove.challenges.b93a3f80423b4421955f90e3433aaacd.Dog aDog = new com.github.ivan.kopylove.challenges.b93a3f80423b4421955f90e3433aaacd.Dog("Max");
        modifyField(aDog);
        assertEquals(aDog.getName(), "Puppy");
    }

    @Test
    void test3()
    {
        com.github.ivan.kopylove.challenges.b93a3f80423b4421955f90e3433aaacd.Dog aDog = new com.github.ivan.kopylove.challenges.b93a3f80423b4421955f90e3433aaacd.Dog("Max");
        createADogInside(aDog);
        assertEquals(aDog.getName(), "Puppy");
    }

    private void createNewInstanceInside(com.github.ivan.kopylove.challenges.b93a3f80423b4421955f90e3433aaacd.Dog dog)
    {
        // change dog inside of foo() to point to a new Dog instance "Fifi"
        dog = new com.github.ivan.kopylove.challenges.b93a3f80423b4421955f90e3433aaacd.Dog("Fifi");
    }

    private void modifyField(com.github.ivan.kopylove.challenges.b93a3f80423b4421955f90e3433aaacd.Dog dog)
    {
        dog.setName("Puppy");
    }

    private void createADogInside(com.github.ivan.kopylove.challenges.b93a3f80423b4421955f90e3433aaacd.Dog dog)
    {
        com.github.ivan.kopylove.challenges.b93a3f80423b4421955f90e3433aaacd.Dog dog1 = new com.github.ivan.kopylove.challenges.b93a3f80423b4421955f90e3433aaacd.Dog("Jack London");
        dog1 = dog;
        dog1.setName("Puppy");
    }
}