public class FrogJump {

    public static int jump(int[]nums,int n){
        if(n==1){
            return 0;
        }
        int[] dp=new int[n];
        dp[0]=0;
        dp[1]=Math.abs(nums[1]-nums[0]);
        for(int i=2;i<n;i++){
            dp[i]=Math.min(dp[i-1]+Math.abs(nums[i]-nums[i-1]),dp[i-2]+Math.abs(nums[i]-nums[i-2]));
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        System.out.println(jump(new int[]{10,20,30,10}, 4));
    }   
}
