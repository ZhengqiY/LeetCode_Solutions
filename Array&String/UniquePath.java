package ArrayAndString;

public class UniquePath {
    public int uniquePath(int m, int n){
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i=1;i<=n-1;i++){
            dp[0][i] = 1;
        }
        for (int i=1;i<=m-1;i++){
            dp[i][0] = 1;
        }
        for (int row=1;row<=m-1;row++){
            for (int col=1;col<=n-1;col++){
                dp[row][col] = dp[row-1][col] + dp[row][col-1];
            }
        }
        return dp[m-1][n-1];
    }
}
