package com.github.ivan.kopylove.challenges.b2cc937005254053bb530c78855c76e1;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * <a href="https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/submissions/845647003/">1047. Remove All Adjacent Duplicates In String</a>
 */
class Solution
{
    public String removeDuplicates(String s)
    {
        Deque<Character> deque = new LinkedList<Character>();

        boolean occurence = true;

        while (occurence)
        {
            occurence = false;
            for (int i = 0; i < s.length(); i++)
            {
                if (new Character(s.charAt(i)).equals(deque.peek()))
                {
                    deque.removeFirst();
                    occurence = true;
                }
                else
                {
                    deque.addFirst(s.charAt(i));
                }
            }

            s = "";

            Iterator iterator = deque.descendingIterator();

            while (iterator.hasNext())
            {
                s += iterator.next();
            }

            deque.clear();
        }

        return s;
    }
}