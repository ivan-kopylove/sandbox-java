package com.github.ivan.kopylove.challenges.b4aa1614577b46bbaabe26e3f8c49b07;

/**
 * <a href="https://leetcode.com/problems/deepest-leaves-sum/submissions/943255942/">1302. Deepest Leaves Sum</a>
 */
class Solution
{
    public int deepestLeavesSum(TreeNode root)
    {

        int deepness = deepestNode(root);
        return deepestSum(root, deepness, 1);
    }

    private int deepestNode(TreeNode node)
    {
        if (node == null)
        {
            return 0;
        }

        int left = deepestNode(node.left);
        int right = deepestNode(node.right);

        return Math.max(left, right) + 1;
    }

    private int deepestSum(TreeNode root, int deepness, int currentDeep)
    {
        if (root == null)
        {
            return 0;
        }

        if (currentDeep == deepness && root.left == null && root.right == null)
        {
            return root.val;
        }
        else
        {
            ++currentDeep;
            int left = deepestSum(root.left, deepness, currentDeep);
            int right = deepestSum(root.right, deepness, currentDeep);

            return left + right;
        }
    }
}