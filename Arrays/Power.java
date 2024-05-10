public class Power {
    public static double myPow(double x, int n) {
        if(n==0){
            return 1.0;
        }
        double result=1.0;
        long power=Math.abs((long)n);
        while(power>0){
            if(power%2==1){
                result*=x;
            }
            x*=x;
            power/=2;
        }
        return n<0? 1.0/result :result;
    }

   public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));
   } 
}
