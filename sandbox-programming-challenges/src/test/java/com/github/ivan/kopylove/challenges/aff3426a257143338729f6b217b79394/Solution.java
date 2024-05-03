package com.github.ivan.kopylove.challenges.aff3426a257143338729f6b217b79394;

/**
 * <a href="https://leetcode.com/problems/maximum-binary-tree-ii/submissions/995731691/">998. Maximum Binary Tree II</a>
 */
class Solution
{
    public TreeNode insertIntoMaxTree(TreeNode root, int val)
    {

        if (root.val < val)
        {
            TreeNode injected = new TreeNode(val, root, null);
            return injected;
        }

        traverse(root, root.right, val);
        return root;
    }

    public void traverse(TreeNode parent, TreeNode node, int targetVal)
    {
        if (targetVal < parent.val)
        {
            if (node == null || targetVal > node.val)
            {
                TreeNode injected = new TreeNode(targetVal, node, null);
                parent.right = injected;
            }
            else
            {
                traverse(node, node.right, targetVal);
            }
        }
    }
}