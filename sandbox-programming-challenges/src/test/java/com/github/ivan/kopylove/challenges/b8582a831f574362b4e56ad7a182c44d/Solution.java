package com.github.ivan.kopylove.challenges.b8582a831f574362b4e56ad7a182c44d;

/**
 * <a href="https://leetcode.com/problems/merge-nodes-in-between-zeros/submissions/945551632/">2181. Merge Nodes in Between Zeros</a>
 */
class Solution
{
    public ListNode mergeNodes(ListNode head)
    {

        int acc = 0;
        ListNode current = head.next;
        ListNode previousZero = head;

        while (current.next != null)
        {
            acc += current.val;

            if (current.val == 0)
            {
                previousZero.val = acc;
                previousZero.next = current;
                previousZero = current;
                acc = 0;
            }

            current = current.next;
        }

        previousZero.val = acc;
        previousZero.next = null;


        return head;
    }
}