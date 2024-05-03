package com.github.ivan.kopylove.challenges.a1868134aafd4c2e92246c3912bcd76c;

/**
 * <a href="https://leetcode.com/problems/valid-palindrome/submissions/928464866/">125. Valid Palindrome</a>
 */
class Solution
{
    public boolean isPalindrome(String s)
    {
        String depleted = s.replaceAll("[^a-zA-Z0-9]", "")
                           .toLowerCase();

        return depleted.contentEquals(new StringBuilder(depleted).reverse());
    }
}