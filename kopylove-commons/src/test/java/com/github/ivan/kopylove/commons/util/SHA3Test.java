package com.github.ivan.kopylove.commons.util;

import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;

import static com.github.ivan.kopylove.commons.util.SHA3.sha3_256;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SHA3Test
{

    @Test
    public void test() throws NoSuchAlgorithmException
    {
        // when
        String result = sha3_256("test".getBytes());


        // then
        assertThat(result, equalTo("36f028580bb02cc8272a9a020f4200e346e276ae664e45ee80745574e2f5ab80"));
    }
}