import java.util.Arrays;

public class GridUniquePath2 {
    public static int uniquePath2(int[][] grid){
        int r=grid.length;
        int c=grid[0].length;
        int[][] dp=new int[r+1][c+1];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return helper(grid,r-1,c-1,dp);
    }
    
    private static int helper(int[][] grid, int r, int c, int[][] dp) {
        if(r<0 || c<0 || grid[r][c]==1){
            return 0;
        }
        if(r==0 && c==0){
            return 1;
        }
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        int down=helper(grid, r-1, c, dp);
        int right=helper(grid, r, c-1, dp);
        return dp[r][c]=down+right;
    }

    public static void main(String[] args) {
        System.out.println(uniquePath2(new int[][]{{0,0,1},{0,1,0},{0,0,0}}));
    }
}
