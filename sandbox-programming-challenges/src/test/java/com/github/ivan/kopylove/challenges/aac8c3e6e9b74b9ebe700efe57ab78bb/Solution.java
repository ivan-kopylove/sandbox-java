package com.github.ivan.kopylove.challenges.aac8c3e6e9b74b9ebe700efe57ab78bb;

/**
 * <a href="https://leetcode.com/problems/linked-list-cycle/submissions/851631718/">141. Linked List Cycle</a>
 */
public class Solution
{
    public boolean hasCycle(ListNode head)
    {
        if (head == null)
        {
            return false;
        }

        ListNode tortoise = head;
        ListNode hare = head.next;

        while (tortoise != null && hare != null)
        {
            if (tortoise == hare)
            {
                return true;
            }
            if (hare.next == null)
            {
                return false;
            }

            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        return false;
    }
}