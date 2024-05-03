package com.github.ivan.kopylove.challenges.b1d538bbbd374162b93cf39bb3059574;

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