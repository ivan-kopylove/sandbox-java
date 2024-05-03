package com.github.ivan.kopylove.challenges.a3904cdd812744afb0cc5d8eb62d4524;

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