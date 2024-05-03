package com.github.ivan.kopylove.challenges.a615cb42c6744cc785b65c1c8904d316;

/**
 * <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/923554606/">104. Maximum Depth of Binary Tree</a>
 */
class Solution
{
    public int maxDepth(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }

        if (root.left == null && root.right == null)
        {
            return 1;
        }
        int maxDepth = 0;
        int currentDepth = 0;

        return traverse(root, maxDepth, currentDepth);
    }

    private int traverse(TreeNode node, int maxDepth, int currentDepth)
    {
        if (node == null)
        {
            return maxDepth;
        }

        currentDepth++;
        System.out.println(currentDepth + " " + node.val);
        if (currentDepth > maxDepth)
        {
            maxDepth = currentDepth;
        }

        int l = traverse(node.left, maxDepth, currentDepth);
        int r = traverse(node.right, maxDepth, currentDepth);

        return l > r ? l : r;
    }
}