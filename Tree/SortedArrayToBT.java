package com.leetcode;

public class SortedArrayToBT {
    public TreeNode sortedArrayToBT(int[] nums){
        if (nums==null) return null;
        return constructTree(nums, 0,nums.length-1);
    }

    public TreeNode constructTree(int[] nums, int left, int right){
        if (left>right) return null;
        int N = (left+right)/2;
        TreeNode root = new TreeNode(nums[N]);
        root.left = constructTree(nums, left, N-1);
        root.right = constructTree(nums, N+1, right);
        return root;
    }
}
