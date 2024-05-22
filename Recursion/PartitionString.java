import java.util.ArrayList;
import java.util.List;

public class PartitionString {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> currentPartition, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(currentPartition));
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String substring = s.substring(start, end);
            if (isPalindrome(substring)) {
                currentPartition.add(substring);
                backtrack(s, end, currentPartition, result);
                currentPartition.remove(currentPartition.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        PartitionString solution = new PartitionString();
        String s = "aab";
        List<List<String>> result = solution.partition(s);
        for (List<String> partition : result) {
            System.out.println(partition);
        }
    }
}

