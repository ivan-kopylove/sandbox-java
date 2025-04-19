package com.github.ivan.kopylove.sandbox.a3bb337e00fa4147990f25dd6e68ea4b;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TseTest
{
    @Nested
    class RenameMe
    {
        @Test
        @DisplayName("Should %verb% when / if")
        void should_do_something_when_condition()
        {
            // given

            // when

            // then
            MatcherAssert.assertThat("actual result", CoreMatchers.equalTo("expected result"));
        }
    }

}
