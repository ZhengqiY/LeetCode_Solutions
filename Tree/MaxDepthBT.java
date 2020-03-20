package com.leetcode;

/**
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its depth = 3.
 * 递归 - 树解法
 * 左右 回什么
 * 这一步做什么
 * 往上传什么
 */


public class MaxDepthBT {
    public int maxDepthBT(TreeNode root){
         if (root==null) return 0;
         int left = maxDepthBT(root.left);
         int right = maxDepthBT(root.right);
         return Math.max(left,right)+1;
    }

    public static void main(String[] args){
        MaxDepthBT sol = new MaxDepthBT();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(4);
        System.out.println(sol.maxDepthBT(root));
    }
}
