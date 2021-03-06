package com.leetcode;

/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given the below binary tree and sum = 22,
 *
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \      \
 * 7    2      1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */
public class HasPath {
    public boolean hasPath(TreeNode root,int sum){
        if (root==null) return false;
        if (root.val==sum&&root.left==null&&root.right==null) return true;
        if (root.left!=null) {
            root.left.val = root.val + root.left.val;
        }else{
            boolean resLeft = false;
        }
        boolean resLeft = hasPath(root.left,sum);
        if (root.right!=null) {
            root.right.val = root.val + root.right.val;
        }else{
            boolean resRight = false;
        }
        boolean resRight = hasPath(root.right,sum);
        return (resLeft | resRight);
    }
}

