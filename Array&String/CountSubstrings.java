package ArrayAndString;

/**
 * Given a string, your task is to count how many palindromic substrings in this string.
 *
 * The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.
 *
 * Example 1:
 *
 * Input: "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 *
 *
 * Example 2:
 *
 * Input: "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 */
public class CountSubstrings {
    public int countSubstrings(String s){
        int N = s.length();
        int res  = 0;
         boolean[][] dp = new boolean[N][N];
         for (int i=N-1;i>=0;i--){
             for (int j=i;j<N;j++){
                 if (s.charAt(i)==s.charAt(j) && (j-i < 3 || dp[i+1][j-1])){
                     dp[i][j] = true;
                     res++;
                 }
             }
         }
         return res;
    }
}
