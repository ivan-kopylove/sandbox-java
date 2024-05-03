package com.github.ivan.kopylove.challenges.a56de408a2474f6fb3925aaeff33c224;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/920660947/">83. Remove Duplicates from Sorted List</a>
 */
class Solution
{
    public ListNode deleteDuplicates(ListNode head)
    {
        Set<Integer> occurrences = new HashSet<Integer>();

        ListNode current = head;
        ListNode previous = head;

        while (current != null)
        {
            if (occurrences.contains(current.val))
            {
                previous.next = current.next;
            }
            else
            {
                previous = current;
            }

            occurrences.add(current.val);
            current = current.next;
        }

        return head;
    }
}