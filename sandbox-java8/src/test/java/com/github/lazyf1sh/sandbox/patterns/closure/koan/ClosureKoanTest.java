package com.github.lazyf1sh.sandbox.patterns.closure.koan;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Make provider return a value passed from initial call
 */
public class ClosureKoanTest {

    @Test
    public void runTest(){
        TextProvider provider = getProvider(15);
        assertEquals(15,  provider.get());
    }

     @Test
    public void runTest2(){
        TextProvider provider = getProvider(20);
        assertEquals(20,  provider.get());
    }


    static TextProvider getProvider(int value) {
        value = 30; // why this line prevents from using value inside inner class?
        return new TextProvider() {
            @Override
            public int get() {
//               return value;
                return 30;
            }
        };
    }

    interface TextProvider {
        int get();
    }
}