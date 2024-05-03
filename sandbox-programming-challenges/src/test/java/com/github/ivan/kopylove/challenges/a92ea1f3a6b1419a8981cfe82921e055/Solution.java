package com.github.ivan.kopylove.challenges.a92ea1f3a6b1419a8981cfe82921e055;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/921096407/">94. Binary Tree Inorder Traversal</a>
 */
class Solution
{
    public List<Integer> inorderTraversal(TreeNode root)
    {
        List<Integer> result = new ArrayList<>();

        traverseInorder(root, result);
        return result;
    }

    private void traverseInorder(TreeNode node, List<Integer> result)
    {
        if (node == null)
        {
            return;
        }


        traverseInorder(node.left, result);
        result.add(node.val);

        traverseInorder(node.right, result);
    }
}