package com.leetcode;
/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

import java.util.HashMap;


public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int N = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<N;i++){
            map.put(nums[i],i);
        }
        for (int i=0;i<N;i++){
            int comp = target - nums[i];
            if (map.containsKey(comp) && map.get(comp) != i) {
                int id = map.get(comp);
                return new int[] { i,id };
            }
        }
        return new int[]{0,0} ;
    }

    public static void main(String[] args){
        TwoSum sol = new TwoSum();
        System.out.println(sol.twoSum(new int[] {2,7,11,15}, 9));
    }
}
