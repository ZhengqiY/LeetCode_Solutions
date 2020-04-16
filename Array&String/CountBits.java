package ArrayAndString;

/**
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
 *
 * Example 1:
 *
 * Input: 2
 * Output: [0,1,1]
 * Example 2:
 *
 * Input: 5
 * Output: [0,1,1,2,1,2]
 */
public class CountBits {
    public int[] countBits(int num){
        int[] dp = new int[num+1];
        for (int i=1;i<=num;i++){
            dp[i] = dp[i/2];
            if (i%2==1){
                dp[i]++;
            }
        }
        return dp;
    }
}

/**
 * 1) >> (Signed right shift) In Java, the operator ‘>>’
 * is signed right shift operator. All integers are signed in Java, and
 * 2it is fine to use >> for negative numbers. The operator ‘>>’ uses the sign bit (left most bit)
 * to fill the trailing positions after shift. If the number is negative, then 1 is used as a filler
 * and if the number is positive, then 0 is used as a filler.
 * For example, if binary representation of number is 10….100,
 * then right shifting it by 2 using >> will make it 11…….1.
 * See following Java programs as example ‘>>’
 */
