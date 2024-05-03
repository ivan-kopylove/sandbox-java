package com.github.ivan.kopylove.challenges.b393675208bf44cbbb141d015175fbe8;

class TreeNode
{
    int      val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {this.val = val;}

    TreeNode(int val, TreeNode left, TreeNode right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}