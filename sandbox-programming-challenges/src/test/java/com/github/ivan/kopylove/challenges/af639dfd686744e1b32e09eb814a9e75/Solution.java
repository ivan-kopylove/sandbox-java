package com.github.ivan.kopylove.challenges.af639dfd686744e1b32e09eb814a9e75;

/**
 * <a href="https://leetcode.com/problems/middle-of-the-linked-list/submissions/854958144/">876. Middle of the Linked List</a>
 */
class Solution
{
    public ListNode middleNode(ListNode head)
    {
        if (head == null)
        {
            return null;
        }

        ListNode walker = head;
        ListNode runner = head;

        while (runner != null && runner.next != null && runner.next.next != null)
        {
            walker = walker.next;
            runner = runner.next.next;
        }

        if (runner.next != null)
        {
            return walker.next;
        }
        else
        {
            return walker;
        }
    }
}