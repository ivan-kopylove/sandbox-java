package exercise.node.converter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListNodeConverterTest
{

    @Test
    public void run()
    {
        ListNodeConverter listNodeConverter = new ListNodeConverter();
        ListNode result = listNodeConverter.convert(new int[]{1, 2});
        assertEquals(result, null);
    }
}