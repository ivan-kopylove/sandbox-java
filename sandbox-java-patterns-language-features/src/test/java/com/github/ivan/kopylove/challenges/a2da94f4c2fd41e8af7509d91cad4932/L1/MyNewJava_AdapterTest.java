package com.github.ivan.kopylove.challenges.a2da94f4c2fd41e8af7509d91cad4932.L1;

import com.github.ivan.kopylove.challenges.a2da94f4c2fd41e8af7509d91cad4932.L1.adapter.MyNewJavaAdapter;
import com.github.ivan.kopylove.challenges.a2da94f4c2fd41e8af7509d91cad4932.L1.spi.MyNewJavaSpi;
import com.github.ivan.kopylove.challenges.a2da94f4c2fd41e8af7509d91cad4932.L1.usecase.MyNewJavaUseCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class MyNewJava_AdapterTest {


    @Test
    @DisplayName("Should %verb% when / if")
    void should_do_something_when_condition() {
        // given
        MyNewJavaAdapter myNewJavaAdapter = new MyNewJavaAdapter(
                new MyNewJavaUseCase()
        );

        // when
        String result = myNewJavaAdapter.callMe(new MyNewJavaSpi.Payload(""));

        // then
        assertThat(result, equalTo("expected result"));
    }

}