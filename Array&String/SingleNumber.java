package com.leetcode;

import java.util.HashMap;
import java.util.Set;

/**
 *Given a non-empty array of integers, every element appears twice except for one. Find that single one.

        Note:

        Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

        Example 1:

        Input: [2,2,1]
        Output: 1
        Example 2:

        Input: [4,1,2,1,2]
        Output: 4
 */
public class SingleNumber {
    public int singleNumber(int[] nums){
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<n;i++) {
            if (map.containsKey(nums[i])){
                map.remove(nums[i]);
            }else{
                map.put(nums[i],1);
            }
            //map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (Integer key:map.keySet()){
            if (map.get(key)==1){
                return key;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        SingleNumber sol = new SingleNumber();
        System.out.println(sol.singleNumber(new int[] {2,2,1,1,4}));
    }
}

// remove, get, put, containsKey