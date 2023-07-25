package exercise.node.converter;

import java.util.Objects;

public class ListNode
{

    private int      val;
    private ListNode next;

    public ListNode(int val, ListNode next)
    {

        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        ListNode listNode = (ListNode) o;
        return val == listNode.val;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(val);
    }
}
