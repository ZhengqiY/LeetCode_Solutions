package ArrayAndString;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 *
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */
import java.util.Stack;

public class PlusOne {
    public int[] plusOne(int[] digits){
        int N=digits.length;
        digits[N-1] = digits[N-1]+1;
        int store = 0;
        for (int i=N-1;i>=0;i--){
            if((digits[i]+store)>9){
                digits[i] = (digits[i]+store)%10;
                store = 1;
            }else{
                digits[i] = digits[i]+store;
                store = 0;
            }
        }
        Stack<Integer> stack = new Stack<>();

        if (store==1){
            for (int i=N-1;i>=0;i--){
                stack.push(digits[i]);
            }
            stack.push(store);
            int[] res = new int[N+1];
            for (int i=0;i<=N;i++){
                res[i] = stack.peek();
                stack.pop();
            }
            return res;
        };
        return digits;
    }

}
