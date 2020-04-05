package ArrayAndString;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 *
 * Example 1:
 *
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class ClimbStairs {
    public int climbStairs(int n){
        int[] dp = new int[3];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2;i<n+1;i++){
            dp[i%3] = dp[(i-1)%3] + dp[(i-2)%3];
        }
        return dp[n%3];
    }
/**
    public void backtrack(int residual){
        if (residual==0) res++;
        if (residual>0) backtrack(residual-1);
        if (residual>1) backtrack(residual-2);
    }
**/
    public static void main(String[] args){
        ClimbStairs sol = new ClimbStairs();
        int n = 4;
        System.out.println(sol.climbStairs(n));
    }
}
