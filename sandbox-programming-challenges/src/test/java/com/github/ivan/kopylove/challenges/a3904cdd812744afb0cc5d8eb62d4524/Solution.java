package com.github.ivan.kopylove.challenges.a3904cdd812744afb0cc5d8eb62d4524;

/**
 * <a href="https://leetcode.com/problems/balanced-binary-tree/submissions/924731618/">110. Balanced Binary Tree“</a>
 */
class Solution
{
    public boolean isBalanced(TreeNode root)
    {

        if (root == null)
        {
            return true;
        }
        if (root.left == null && root.right == null)
        {
            return true;
        }

        int result = getHeight(root);
        return result != -1;
    }

    private int getHeight(TreeNode node)
    {
        if (node == null)
        {
            return 0;
        }

        int l = getHeight(node.left);
        int r = getHeight(node.right);
        if (l == -1 || r == -1)
        {
            return -1;
        }

        if (Math.abs(r - l) > 1)
        {
            return -1;
        }

        return Math.max(l, r) + 1;
    }
}