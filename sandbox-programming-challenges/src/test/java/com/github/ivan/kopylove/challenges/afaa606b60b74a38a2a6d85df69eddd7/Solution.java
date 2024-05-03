package com.github.ivan.kopylove.challenges.afaa606b60b74a38a2a6d85df69eddd7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/increasing-order-search-tree/submissions/498482369/">897. Increasing Order Search Tree</a>
 */
class Solution
{
    public TreeNode increasingBST(TreeNode root)
    {

        if (root.left == null && root.right == null)
        {
            return root;
        }

        List<TreeNode> ordered = new ArrayList<>();

        Stack<TreeNode> stackQue = new Stack<>();
        Set<TreeNode> visited = new HashSet<>();


        stackQue.push(root);

        while (!stackQue.isEmpty())
        {
            TreeNode current = stackQue.pop();

            if (visited.contains(current))
            {
                ordered.add(current);
                continue;
            }
            else
            {
                visited.add(current);
            }

            if (current.left != null)
            {
                stackQue.push(current.left);
            }

            if (current.right != null)
            {
                stackQue.push(current);
                stackQue.push(current.right);
            }
            else
            {
                ordered.add(current);
            }
        }

        ordered.forEach(val -> System.out.println(val.val));


        for (int i = ordered.size() - 1; i > 0; i--)
        {
            TreeNode node = ordered.get(i);
            TreeNode nodeNext = ordered.get(i - 1);
            System.out.println("i: " + i + " node.val: " + node.val + " --- " + "nodeNext.val: " + nodeNext.val);
            node.right = nodeNext;
            node.left = null;
            nodeNext.left = null;
            nodeNext.right = null;
        }

        System.out.println("ordered.size(): " + ordered.size());
        System.out.println("ordered.size() - 1: " + (ordered.size() - 1));


        return ordered.get(ordered.size() - 1);
    }
}