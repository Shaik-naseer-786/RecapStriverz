import java.util.Arrays;

public class GridUniquePath {
    public static int uniquePath(int r,int c){
       

        int[][] dp=new int[r+1][c+1];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return helper(r,c,dp);
    }
    
    private static int helper(int r, int c ,int[][] dp) {
        if(r==1 || c==1){
            return 1;
        }
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        int down=helper(r-1, c, dp);
        int right=helper(r, c-1, dp);
        dp[r][c]=down+right;
        return dp[r][c];

    }

    public static void main(String[] args) {
        System.out.println(uniquePath(3, 3));
    }
}
