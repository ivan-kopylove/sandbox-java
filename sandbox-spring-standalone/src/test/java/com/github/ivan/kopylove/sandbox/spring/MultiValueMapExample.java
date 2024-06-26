package com.github.ivan.kopylove.sandbox.spring;

import org.junit.jupiter.api.Test;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Purpose of this example: to practice MultiValueMap usage.<br/>
 * Multimap has a usual key and {@link List} as of values a value.
 */
class MultiValueMapExample
{
    @Test
    void test1()
    {
        MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
        multiValueMap.put("key1", Collections.singletonList("1"));
        multiValueMap.put("key1", Arrays.asList("2", "3")); //overwrites previous value
        multiValueMap.put("key2", Collections.singletonList("1"));
        multiValueMap.put("key2", Arrays.asList("2", "3")); //overwrites previous value

        assertEquals("2",
                     multiValueMap.get("key1")
                                  .get(0));
        assertEquals("3",
                     multiValueMap.get("key1")
                                  .get(1));
    }

    /**
     * Demonstates that multivalue map does not appends to the values
     */
    @Test
    void test2()
    {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {

            MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
            multiValueMap.put("key1", Collections.singletonList("1"));
            multiValueMap.put("key1", Arrays.asList("2", "3")); //overwrites previous value
            multiValueMap.put("key2", Collections.singletonList("1"));
            multiValueMap.put("key2", Arrays.asList("2", "3")); //overwrites previous value

            assertNotEquals("1",
                            multiValueMap.get("key1")
                                         .get(0));
            assertNotEquals("1",
                            multiValueMap.get("key1")
                                         .get(1));
            assertNotEquals("1",
                            multiValueMap.get("key1")
                                         .get(2));
        });
    }
}
