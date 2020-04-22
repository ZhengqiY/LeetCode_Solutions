package ArrayAndString;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Example 1:
 *
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: "cbbd"
 * Output: "bb"
 */
public class LongestPalindrome {
    public String longestPalindrome(String s){
        if (s.length()==0) return "";
        int N = s.length();
        int max = Integer.MIN_VALUE;;
        int start = 0;
        int end = 0;
        boolean[][] dp = new boolean[N][N];
        for (int i=N-1;i>=0;i--){
            for (int j=i;j<N;j++){
                if (s.charAt(i)==s.charAt(j) && (j-i<3 || dp[i+1][j-1])){
                    dp[i][j] = true;
                    if (j-i+1>max){
                       start = i;
                       end = j;
                    }
                    max = Math.max(max,j-i+1);
                }
            }
        }
        String res = s.substring(start,end+1);
        return res;
    }

    public static void main(String[] args){
        String s = "babad";
        LongestPalindrome sol = new LongestPalindrome();
        System.out.println(sol.longestPalindrome(s));
    }
}

// Empty situation: if (s.length()==0) return "";
// String res = s.substring(start,end+1);


