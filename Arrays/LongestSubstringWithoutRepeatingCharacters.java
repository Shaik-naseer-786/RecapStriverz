import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int length=0;
        int left=0;
        int right=0;
        HashSet<Character> hs=new HashSet<>();
        while(right<s.length()){
            if(!hs.contains(s.charAt(right))){
                hs.add(s.charAt(right));
                right++;
                length=Math.max(length,hs.size());
            }
            else{
                hs.remove(s.charAt(left));
                left++;
            }
        }
        return length;
        
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
