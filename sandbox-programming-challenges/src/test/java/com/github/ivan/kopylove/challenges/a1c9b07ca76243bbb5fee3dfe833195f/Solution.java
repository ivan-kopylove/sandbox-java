package com.github.ivan.kopylove.challenges.a1c9b07ca76243bbb5fee3dfe833195f;

/**
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/submissions/465067342/">21. Merge Two Sorted Lists</a>
 */
class Solution
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        if (l1 == null && l2 == null)
        {
            return null;
        }
        ListNode node = new ListNode();
        process(node, l1, l2);
        return node;
    }

    public void process(ListNode nextNode, ListNode l1, ListNode l2)
    {
        if (nextNode != null)
        {
            if (l1 != null && l2 != null)
            {
                if (l1.val < l2.val)
                {
                    nextNode.val = l1.val;
                    nextNode.next = new ListNode();
                    process(nextNode.next, l1.next, l2);
                }
                else
                {
                    nextNode.val = l2.val;
                    nextNode.next = new ListNode();
                    process(nextNode.next, l1, l2.next);
                }
            }
            if (l1 == null && l2 != null)
            {
                nextNode.val = l2.val;
                if (l2.next != null)
                {
                    nextNode.next = new ListNode();
                    process(nextNode.next, l1, l2.next);
                }
            }
            if (l2 == null && l1 != null)
            {
                nextNode.val = l1.val;
                if (l1.next != null)
                {
                    nextNode.next = new ListNode();
                    process(nextNode.next, l1.next, l2);
                }
            }
        }
    }
}