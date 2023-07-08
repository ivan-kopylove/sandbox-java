package exercise.node.converter;

import java.util.List;

public class ListNodeConverter {

    public ListNode convert(int[] array)
    {
        ListNode current = new ListNode(array[array.length - 1], null);

        for(int i = array.length - 1; i >= 0; i--)
        {
            current = new ListNode(array[i], current);
        }

        return current;
    }
}
