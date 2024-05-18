import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
     public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        helper(candidates,target,0,new ArrayList<>(),result);
        return result;
    }
    private static void helper(int[] candidates, int target, int start, List<Integer> temp, List<List<Integer>> result) {
        if(target==0){
            result.add( new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(target-candidates[i]>=0){
                temp.add(candidates[i]);
                helper(candidates, target-candidates[i], i, temp, result);
                temp.remove(temp.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        List<List<Integer>> ans=combinationSum(new int[]{2,3,6,7}, 7);
        for (List<Integer> list : ans) {
            System.out.println(list.toString());
        }
    }
}
