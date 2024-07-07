package com.github.ivan.kopylove.challenges.b393675208bf44cbbb141d015175fbe8;

/**
 * <a href="https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/submissions/928416680/">2265. Count Nodes Equal to Average of Subtree</a>
 */
class Solution
{

    public int averageOfSubtree(TreeNode root)
    {
        return count(root)[2];
    }

    private int[] count(TreeNode node)
    {
        if (node == null)
        {
            return new int[3];
        }

        int[] left = count(node.left);
        int[] right = count(node.right);

        int sum = left[1] + right[1] + node.val;

        int matches = left[2] + right[2];
        int avg = sum / (left[0] + right[0] + 1);


        System.out.println(node.val + " " + sum + " " + (left[0] + right[0] + 1));
        if (avg == node.val)
        {

            matches = left[2] + right[2] + 1;
        }


        return new int[]{left[0] + right[0] + 1, sum, matches};
    }
}