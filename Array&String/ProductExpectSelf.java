package ArrayAndString;

/**
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 *
 * Example:
 *
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 *
 * Note: Please solve it without division and in O(n).
 */

public class ProductExpectSelf {
    public int[] productExpectSelf(int[] nums){
        int N = nums.length;
        int[] left = new int[N];
        int[] right = new int[N];
        int[] res = new int[N];

        for (int i=0;i<N;i++){
            if (i==0){
                left[i] = 1;
            }else{
                left[i] = nums[i-1]*left[i-1];
            }
        }
        for (int i=N-1;i>=0;i--){
            if (i==N-1){
                right[N-1] = 1;
            }else{
                right[i] = right[i+1]*nums[i+1];
            }
        }
        for (int i=0;i<N;i++){
            res[i] = left[i]*right[i];
        }
        return res;
    }
}
