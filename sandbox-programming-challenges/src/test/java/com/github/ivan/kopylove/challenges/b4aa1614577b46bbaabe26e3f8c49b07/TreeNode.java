package com.github.ivan.kopylove.challenges.b4aa1614577b46bbaabe26e3f8c49b07;

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