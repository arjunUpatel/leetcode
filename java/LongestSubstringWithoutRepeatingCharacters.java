import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> tracker = new HashSet<>();
        int startingIndex = 0;
        int longestLength = 0;
        for (int i = 0; i < s.length();) {
            if (tracker.contains(s.charAt(i))) {
                longestLength = longestLength < tracker.size() ? tracker.size() : longestLength;
                tracker.clear();
                i = startingIndex + 1;
            } else {
                startingIndex = tracker.size() == 0 ? i : startingIndex;
                tracker.add(s.charAt(i));
                i++;
            }
        }
        longestLength = longestLength < tracker.size() ? tracker.size() : longestLength;
        return longestLength;
    }
}
