package com.github.ivan.kopylove.challenges.b2d553880d0c47a188bc989bf54ff8b7;

/**
 * <a href="https://leetcode.com/problems/defanging-an-ip-address/submissions/942120601/">1108. Defanging an IP Address</a>
 */
class Solution
{
    public String defangIPaddr(String address)
    {
        return address.replace(".", "[.]");
    }
}