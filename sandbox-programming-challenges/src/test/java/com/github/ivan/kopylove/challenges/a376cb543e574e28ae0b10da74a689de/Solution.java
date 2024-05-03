package com.github.ivan.kopylove.challenges.a376cb543e574e28ae0b10da74a689de;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/symmetric-tree/submissions/921660184/">101. Symmetric Tree</a>
 */
class Solution
{
    public boolean isSymmetric(TreeNode root)
    {
        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();

        Set<TreeNode> visited = new HashSet<>();

        TreeNode leftNode = null;
        TreeNode rightNode = null;

        leftStack.push(root.left);
        rightStack.push(root.right);

        while (!leftStack.isEmpty())
        {
            leftNode = leftStack.pop();
            rightNode = rightStack.pop();

            if (visited.contains(leftNode) || visited.contains(rightNode) || leftNode == null && rightNode == null)
            {
                continue;
            }

            if (leftNode == null && rightNode != null || leftNode != null && rightNode == null)
            {
                return false;
            }

            if (leftNode.val != rightNode.val)
            {
                return false;
            }

            visited.add(leftNode);
            visited.add(rightNode);

            leftStack.push(leftNode.right);
            leftStack.push(leftNode.left);
            rightStack.push(rightNode.left);
            rightStack.push(rightNode.right);
        }
        return true;
    }
}