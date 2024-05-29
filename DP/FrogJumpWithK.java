public class FrogJumpWithK{

    public static int minimizeCost(int arr[],int N,int K){
        //code here
        int[] dp=new int[N];
        for(int i=1;i<N;i++){
            dp[i]=Integer.MAX_VALUE;
        }
        dp[0]=0;
        
        for(int i=0;i<N;i++){
            for(int j=1;j<=K;j++){
                if(i+j<N){
                    dp[i+j]=Math.min(dp[i+j],dp[i]+Math.abs(arr[i+j]-arr[i]));
                }
            }
        }
        return dp[N-1];

        
    }
    public static void main(String[] args) {
        System.out.println(minimizeCost(new int[]{10,30,40,50,20}, 5, 3));
    }
}