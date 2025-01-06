package a2da94f4c2fd41e8af7509d91cad4932.L1;




import a2da94f4c2fd41e8af7509d91cad4932.L1.adapter.*;
import a2da94f4c2fd41e8af7509d91cad4932.L1.spi.*;
import a2da94f4c2fd41e8af7509d91cad4932.L1.usecase.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class MyNewJava_AdapterTest {


    @Test
    @DisplayName("Should %verb% when / if")
    void should_do_something_when_condition() {
        // given
        MyNewJava_Adapter myNewJavaAdapter = new MyNewJava_Adapter(
                new MyNewJava_UseCase()
        );

        // when
        String result = myNewJavaAdapter.callMe(new MyNewJava_Spi.Payload(""));

        // then
        assertThat(result, equalTo("some result 123"));
    }

}