package com.leetcode;
/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * Example:
 *
 * Input: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * Output: [1,3,2]
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root){

        //List<Integer> res = new ArrayList<>();
        if (root.left!=null){
            inorderTraversal(root.left);
        }
        res.add(root.val);
        if (root.right!=null){
            inorderTraversal(root.right);
        }
        return res;
    }

    public List<Integer> inorderTraversal2(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root==null) return res;
        TreeNode curr = root;
        while(curr!=null||!stack.isEmpty()){
            while (curr!=null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }


    public static void main(String[] args){
        InorderTraversal sol = new InorderTraversal();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> res = sol.inorderTraversal2(root);
        System.out.println(res);
    }
}

//inorder
//preorder
//postorder

//stack treenode = stack.pop()
