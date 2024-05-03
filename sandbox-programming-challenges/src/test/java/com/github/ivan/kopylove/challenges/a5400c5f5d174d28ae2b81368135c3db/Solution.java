package com.github.ivan.kopylove.challenges.a5400c5f5d174d28ae2b81368135c3db;

/**
 * <a href="https://leetcode.com/problems/minimum-depth-of-binary-tree/submissions/926094686/">111. Minimum Depth of Binary Tree</a>
 */
class Solution
{
    public int minDepth(TreeNode root)
    {
        return depth(root);
    }

    private int depth(TreeNode node)
    {
        if (node == null)
        {
            return 0;
        }

        int left = depth(node.left);
        int right = depth(node.right);

        if (left != 0 && right != 0)
        {
            return Math.min(left, right) + 1;
        }
        else
        {
            return Math.max(left, right) + 1;
        }
    }
}