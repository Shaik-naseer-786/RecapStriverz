import java.util.ArrayList;
import java.util.Collections;

public class SubsetSums {
    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> result=new ArrayList<>();
        helper(arr,n,0,0,result);
        Collections.sort(result);
        return result;
    }

    private static void helper(ArrayList<Integer> arr, int n, int index, int sum, ArrayList<Integer> result) {
       if(index==n){
        result.add(sum);
        return;
       }
       helper(arr, n, index+1, sum+arr.get(index), result);
       helper(arr, n, index+1, sum, result);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        arr.add(2);
        arr.add(3);
        int n = arr.size();

        ArrayList<Integer> result = subsetSums(arr, n);
        System.out.println("Subset sums: " + result);
    }
}