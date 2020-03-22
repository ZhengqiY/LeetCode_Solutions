package com.leetcode;

/**
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
 *
 * Example 1:
 * Input:nums = [1,1,1], k = 2
 * Output: 2
 */
import java.util.HashMap;

public class SubarraySum {
    public int subarraySum(int[] nums, int k){
        int N = nums.length;
        int sum = 0;
        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for (int i=0;i<N;i++){
            sum += nums[i];
            if (map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return count;
    }

    public static void main(String[] args){
        SubarraySum sol = new SubarraySum();
        int[] nums = new int[] {1,1,3,1,1,0};
        int k = 2;
        System.out.println(sol.subarraySum(nums,k));
    }
}


//行动先后
