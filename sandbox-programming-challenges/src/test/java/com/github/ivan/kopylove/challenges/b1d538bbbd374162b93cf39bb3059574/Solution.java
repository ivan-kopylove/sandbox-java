package com.github.ivan.kopylove.challenges.b1d538bbbd374162b93cf39bb3059574;

/**
 * <a href="https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/submissions/997378718/">1038. Binary Search Tree to Greater Sum Tree</a>
 */
class Solution
{
    private int sum;

    public TreeNode bstToGst(TreeNode root)
    {
        sum(root);
        return root;
    }

    private void sum(TreeNode node)
    {
        if (node == null)
        {
            return;
        }

        sum(node.right);
        node.val += sum;
        sum = node.val;
        sum(node.left);
    }
}