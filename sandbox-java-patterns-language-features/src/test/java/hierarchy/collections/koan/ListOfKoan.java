package hierarchy.collections.koan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ListOfKoan
{
    /**
     * tags:
     * - koan
     * - collections
     * - java-core
     */
    @Test
    @DisplayName("Fix the test, run, and break it back" +
                 "Before running, try to guess what is the trick here")
    void listOf_koan()
    {
        // given
        List<Integer> integers = List.of(1, 2, 3);

        // when
        integers.add(1);

        assertThat(integers.size(), equalTo(3));
    }
}
