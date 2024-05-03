package com.github.ivan.kopylove.challenges.aae2894b04b44e089956e2a2248b88e8;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/binary-tree-preorder-traversal/submissions/924252584/">144. Binary Tree Preorder Traversal</a>
 */
class Solution
{
    public List<Integer> preorderTraversal(TreeNode root)
    {
        List<Integer> order = new ArrayList<>();


        doTraverse(root, order);
        return order;
    }

    private void doTraverse(TreeNode node, List<Integer> order)
    {
        if (node == null)
        {
            return;
        }
        order.add(node.val);
        doTraverse(node.left, order);

        doTraverse(node.right, order);
    }
}