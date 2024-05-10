import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes{
    public static void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        // int[][] res=new int[r][c];
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         if(matrix[i][j]==0){
        //             for(int k=0;k<c;k++){
        //                 res[i][k]=1;
        //             }
        //             for(int k=0;k<c;k++){
        //                 res[k][j]=1;
        //             }
        //         }
        //     }
        // }
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         if(res[i][j]==1){
        //             matrix[i][j]=0;
        //         }
        //     }
        // }

        // using hashSet

        Set<Integer> zeroRows=new HashSet<>();
        Set<Integer> zeroCols=new HashSet<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }
        for (int row : zeroRows) {
            for(int j=0;j<r;j++){
                matrix[row][j]=0;
            }
        }
        for (int col : zeroCols) {
            for(int j=0;j<c;j++){
                matrix[j][col]=0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix={{1,1,1},{1,1,1},{1,1,0}};
        setZeroes(matrix);
        for (int[] is : matrix) {
            System.out.println(Arrays.toString(is));
        }
    }

}