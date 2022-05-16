import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), 1);
            else
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            if (!map.containsKey(t.charAt(i)))
                map.put(t.charAt(i), -1);
            else
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        }

        for (int value : map.values()) {
            if (value != 0)
                return false;
        }
        return true;
    }
}
