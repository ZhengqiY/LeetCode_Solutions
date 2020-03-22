package com.leetcode;

import java.util.HashMap;

public class MajorityElem {
    public int majorityElem(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int N = nums.length;
        for (int i=0;i<N;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int res = 0;
        for (Integer values:map.values()){
            if (values > res){
                res = values;
            }
        }
        int ans = 0;
        for (Integer keys:map.keySet()){
            if (map.get(keys)==res){
                ans = keys;
            }
        }

        return ans;
    }
}
