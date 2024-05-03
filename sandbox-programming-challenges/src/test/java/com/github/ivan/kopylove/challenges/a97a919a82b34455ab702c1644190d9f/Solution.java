package com.github.ivan.kopylove.challenges.a97a919a82b34455ab702c1644190d9f;

/**
 * <a href="https://leetcode.com/problems/same-tree/submissions/922435211/">100. Same Tree</a>
 */
class Solution
{
    public boolean isSameTree(TreeNode p, TreeNode q)
    {
        return check(p, q);
    }

    private boolean check(TreeNode p, TreeNode q)
    {
        if (p == null && q == null)
        {
            return true;
        }
        if (p == null || q == null)
        {
            return false;
        }
        return p.val == q.val && check(p.left, q.left) && check(p.right, q.right);
    }
}