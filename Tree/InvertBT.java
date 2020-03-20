package com.leetcode;
/**
 * Invert a binary tree.
 *
 * Example:
 *
 * Input:
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * Output:
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 */
public class InvertBT {
    public TreeNode invertBT(TreeNode root){
        if (root==null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertBT(root.left);
        invertBT(root.right);
        return root;
    }

    public static void main(String[] args){
        InvertBT sol = new InvertBT();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        printLeafNodes(sol.invertBT(root));
    }

    public static void printLeafNodes(TreeNode node) {
        // base case
        if (node == null) {
            return;
        }
            System.out.println(node.val);
        if (node.left == null && node.right == null) {
            System.out.printf("%d ", node.val);
        }

        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }
}
// recursion
// TreeNode temp