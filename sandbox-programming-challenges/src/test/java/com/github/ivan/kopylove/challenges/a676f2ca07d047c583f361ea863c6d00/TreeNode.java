package com.github.ivan.kopylove.challenges.a676f2ca07d047c583f361ea863c6d00;

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