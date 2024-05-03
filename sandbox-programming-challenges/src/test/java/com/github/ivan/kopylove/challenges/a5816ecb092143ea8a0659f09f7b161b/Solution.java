package com.github.ivan.kopylove.challenges.a5816ecb092143ea8a0659f09f7b161b;

/**
 * <a href="https://leetcode.com/problems/path-sum/submissions/924742635/">112. Path Sum</a>
 */
class Solution
{
    public boolean hasPathSum(TreeNode root, int targetSum)
    {
        return calculate(root, targetSum, 0);
    }

    private boolean calculate(TreeNode node, int targetSum, int currentSum)
    {
        if (node == null)
        {
            return false;
        }

        currentSum += node.val;
        if (node.left == null && node.right == null && targetSum == currentSum)
        {
            return true;
        }

        boolean left = calculate(node.left, targetSum, currentSum);
        boolean right = calculate(node.right, targetSum, currentSum);

        return left || right;
    }
}