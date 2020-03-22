package com.leetcode;

import java.util.HashMap;

public class MissingNumber {
    public int missingNumber(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        int N = nums.length;
        for (int i=0;i<=N;i++){
            map.put(i,map.getOrDefault(i,0));
        }
        for (int i=0;i<N;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int res = 0;
        for (Integer key:map.keySet()){
            if (map.get(key)==0){
                res = key;
            }
        }
        return res;
    }
}
