package ArrayAndString;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */

public class MaxSubarray {
    public int maxSubarray(int[] nums){
        int N = nums.length;
        int sum = 0;
        int res = nums[0];
        for (int i=0;i<N;i++){
            sum += nums[i];
            sum = Math.max(nums[i],sum);
            res = Math.max(res,sum);
        }
        return res;
    }
}
