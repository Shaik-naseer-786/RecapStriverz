import java.util.HashMap;

public class Largestsubarraywith0sum {
    static int  maxLen(int arr[], int n)
    {
       HashMap<Integer,Integer> mp=new HashMap<>();
       int length=0;
       int sum=0;
       for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        if(sum==0){
            length=i+1;
        }
        if(mp.containsKey(sum)){
            length=Math.max(length, i-mp.get(sum));
        }
        else{
            mp.put(sum, i);
        }
       }
       return length;
    }
    public static void main(String[] args) {
        System.out.println(maxLen(new int[]{15,-2,2,-8,1,7,10,23}, 8));
    }
}
