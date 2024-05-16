import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum{
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) { // Skip duplicate elements
                int left = i + 1, right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        // Skip duplicates of left and right pointers
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return list;
        
    }
    public static void main(String[] args) {
        List<List<Integer>> ans=threeSum(new int[]{-1,0,1,2,-1,-4});
        for (List<Integer> li : ans) {
            System.out.println(li);
        }
    }
}