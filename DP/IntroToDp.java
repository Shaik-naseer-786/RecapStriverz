import java.util.Arrays;

public class IntroToDp {

    // Top-Down approach (Memoization)
    static long topDown(int n) {
        // Initialize the memoization array with -1
        long[] dp = new long[n + 1];
        Arrays.fill(dp, -1);
        // Call the helper function
        return helper1(dp, n);
    }

    // Helper function for top-down approach
    private static long helper1(long[] dp, int n) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        // Store the result in dp array
        dp[n] = helper1(dp, n - 1) + helper1(dp, n - 2);
        return dp[n];
    }

    // Bottom-Up approach (Tabulation)
    static long bottomUp(int n) {
        if (n <= 1) {
            return n;
        }
        // Initialize the dp array
        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        // Fill the dp array iteratively
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 697;
        System.out.println("Top-Down approach (Memoization): " + topDown(n));
        System.out.println("Bottom-Up approach (Tabulation): " + bottomUp(n));
    }
}
