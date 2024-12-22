package com.github.ivan.kopylove.challenges.a2da94f4c2fd41e8af7509d91cad4932.L1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class MyNewJava_AdapterTest {


    @Test
    @DisplayName("Should %verb% when / if")
    void should_do_something_when_condition() {
        // given
        MyNewJava_Adapter myNewJavaAdapter = new MyNewJava_Adapter(
                new MyNewJava_UseCase()
        );

        // when
        String result = myNewJavaAdapter.callMe(new MyNewJava_Spi.Payload(new IllegalArgumentException()));

        // then
        assertThat(result, equalTo("expected result"));
    }

}