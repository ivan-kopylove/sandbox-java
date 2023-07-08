package com.github.lazyf1sh.sandbox.patterns.closure.closure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * search engine query with comprehensive examples:
 *  closure baeldung
 */
public class ClosureExampleTest {

    @Test
    public void runTest(){
        TextProvider provider = getProvider(15);
        assertEquals(15,  provider.get());
    }

    static TextProvider getProvider(int value) {

        return new TextProvider() {
            @Override
            public int get() {
               return value;
            }
        };
    }

    interface TextProvider {
        int get();
    }
}
