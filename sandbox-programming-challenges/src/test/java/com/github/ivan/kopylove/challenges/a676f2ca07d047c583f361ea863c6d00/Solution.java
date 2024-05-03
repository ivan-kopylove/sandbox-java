package com.github.ivan.kopylove.challenges.a676f2ca07d047c583f361ea863c6d00;

/**
 * <a href="https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/submissions/926662499/">108. Convert Sorted Array to Binary Search Tree</a>
 */
class Solution
{
    public TreeNode sortedArrayToBST(int[] nums)
    {
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int l, int r)
    {
        if (l > r)
        {
            return null;
        }

        int pivot = (l + r) / 2;

        TreeNode left = build(nums, l, pivot - 1);
        TreeNode right = build(nums, pivot + 1, r);

        return new TreeNode(nums[pivot], left, right);
    }
}