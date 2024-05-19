import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);  // Sort the array to handle duplicates
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) {
            return;  // If remain is less than 0, no valid combination
        } else if (remain == 0) {
            result.add(new ArrayList<>(tempList));  // Found a valid combination
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) {
                    continue;  // Skip duplicates
                }
                tempList.add(candidates[i]);
                backtrack(result, tempList, candidates, remain - candidates[i], i + 1);  // Move to the next index
                tempList.remove(tempList.size() - 1);  // Backtrack
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> combinations = sol.combinationSum2(candidates, target);
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
