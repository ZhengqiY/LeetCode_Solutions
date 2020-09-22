package hash;
/**
 * Given an array of integers nums.
 *
 * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 *
 * Return the number of good pairs.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1,1,3]
 * Output: 4
 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */

import java.util.HashMap;

public class NumIdenticalPairs {
    public int numIdenticalPairs(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],1+map.getOrDefault(nums[i],0));
            res+=map.get(nums[i])-1;
        }
        return res;
    }
}
