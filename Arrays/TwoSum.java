import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(mp.containsKey(c)){
                return new int[]{mp.get(c),i};
            }
            else{
                mp.put(nums[i], i);
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] ans=twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(ans));
    }
}
