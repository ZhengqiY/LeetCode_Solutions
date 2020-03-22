package com.leetcode;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */
public class MoveZeros {
    public void moveZeros(int[] nums){
        int N = nums.length;
        int id = 0;
        for (int i=0;i<N;i++){
            if (nums[i]!=0){
                nums[id] = nums[i];
                id ++;
            }
        }
        for (int i=id;i<N;i++){
            nums[i] = 0;
        }
    }
}

//two pointers
