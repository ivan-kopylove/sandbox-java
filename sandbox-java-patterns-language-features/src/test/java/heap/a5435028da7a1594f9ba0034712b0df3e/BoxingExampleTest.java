package heap.a5435028da7a1594f9ba0034712b0df3e;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class BoxingExampleTest
{
    @Test
    void should_box_to_a_character()
    {
        Character ch = 'a';
    }

    @Nested
    class TrickyCases
    {

        @Test
        void should_do_something_when_condition()
        {
            // given
            Integer iOb1 = 127;
            Integer iOb2 = 127;

            // then
            assertTrue(iOb1 == iOb2);
        }

        @Test
        void should_not_be_equal_because_greater_than_128_is_not_cached_by_default()
        {
            // given
            Integer iOb1 = 128;
            Integer iOb2 = 128;

            // then
            assertFalse(iOb1 == iOb2);
        }

        @Test
        void explicit_object_declaration_should_result_in_different_reference()
        {
            // given
            Integer i1 = new Integer(127);
            Integer i2 = new Integer(127);

            // then
            assertFalse(i1 == i2);
        }
    }
}
