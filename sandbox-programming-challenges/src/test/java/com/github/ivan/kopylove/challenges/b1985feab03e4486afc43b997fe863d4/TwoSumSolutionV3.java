package com.github.ivan.kopylove.challenges.b1985feab03e4486afc43b997fe863d4;

class TwoSumSolutionV3
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        int overflow = 0;

        int sum = l1.val + l2.val + overflow;
        if (sum > 9)
        {
            sum %= 10;
            overflow = 1;
        }
        else
        {
            overflow = 0;
        }

        ListNode nextNode = new ListNode();

        ListNode result = new ListNode();
        result.val = sum;
        if (l1.next != null || l2.next != null || overflow > 0)
        {
            result.next = nextNode;
        }

        sum = 0;
        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null || l2 != null)
        {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;

            sum = val1 + val2 + overflow;
            if (sum > 9)
            {
                sum %= 10;
                overflow = 1;
            }
            else
            {
                overflow = 0;
            }

            if ((l1 != null && l1.next != null) || (l2 != null && l2.next != null) || overflow > 0)
            {
                nextNode.next = new ListNode();
            }

            nextNode.val = sum;
            nextNode = nextNode.next;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        if (overflow > 0)
        {
            nextNode.val = overflow;
        }

        return result;
    }
}
