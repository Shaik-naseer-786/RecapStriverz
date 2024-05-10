import java.util.Arrays;

public class RotateImage {
    public static void rotate(int[][] nums) {
        int r=nums.length;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<i;j++){
                int temp=nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
        }
        for(int i=0;i<r;i++){
            reverse(nums[i]);
        }

    }
    public static void reverse(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
        rotate(nums);
        for (int[] is : nums) {
            System.out.println(Arrays.toString(is));
        }
    }
}
