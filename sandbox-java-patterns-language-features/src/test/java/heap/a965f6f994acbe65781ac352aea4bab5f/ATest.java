package heap.a965f6f994acbe65781ac352aea4bab5f;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ATest
{

        @Test
        @DisplayName("Should %verb% when / if")
        void should_do_something_when_condition() throws InterruptedException
        {
            // given
            MyHouse myHouse = new MyHouse();

            // when

            myHouse.eatPizza();
            myHouse.pizzaGuy();

            // then
            MatcherAssert.assertThat("actual result", CoreMatchers.equalTo("expected result"));
        }


}
