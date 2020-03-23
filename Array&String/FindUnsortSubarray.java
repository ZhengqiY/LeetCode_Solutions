package ArrayAndString;

/**
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.
 *
 * You need to find the shortest such subarray and output its length.
 *
 * Example 1:
 * Input: [2, 6, 4, 8, 10, 9, 15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 */
import java.util.Stack;

public class FindUnsortSubarray {
    public int findUnsortSubarray(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int left = nums.length;
        int right = 0;
        for (int i=0;i<nums.length;i++){
            while (!stack.empty()&&nums[i]<nums[stack.peek()]){
                left = Math.min(left,stack.pop());
            }
            stack.push(i);
        }
        stack.clear();
        for (int i=nums.length-1;i>=0;i--){
            while (!stack.empty()&&nums[i]>nums[stack.peek()]){
                right = Math.max(right,stack.pop());
            }
            stack.push(i);
        }
        if (left>right) return 0;
        int res = right - left + 1;
        return res;
    }
}
