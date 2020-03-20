package com.leetcode;

/**
 * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 *
 * Example:
 * Given a binary tree
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
 */
public class DiameterOfBT {
    int max = 0;
    public int diameterOfBT(TreeNode root){
        depth(root);
        return max;
    }

    private int depth(TreeNode root){
        if(root==null) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        max = Math.max(max, left+right);
        return Math.max(left,right)+1;
    }

    public static void main(String[] args){
        DiameterOfBT sol = new DiameterOfBT();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(1);
        System.out.println(sol.diameterOfBT(root));
    }
}

//private
//divide and conquer

