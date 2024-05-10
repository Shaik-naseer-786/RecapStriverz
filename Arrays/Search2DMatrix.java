public class Search2DMatrix{
    public static boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int low=0;
        int high=r*c-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int midVal=matrix[mid/c][mid%c];
            if(midVal==target){
                return true;
            }
            else if(midVal<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 0));
    }
}