public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String longestPalindrome = "";
        int j, k;
        boolean oddPalindrome = true;
        for (int i = 0; i < s.length();) {
            j = i;
            if (oddPalindrome)
                k = j;
            else
                k = j + 1;
            while (j >= 0 && k <= s.length() - 1) {
                if (s.charAt(j) == s.charAt(k) && (k - j) + 1 > longestPalindrome.length())
                    longestPalindrome = s.substring(j, k + 1);
                else if (s.charAt(j) != s.charAt(k))
                    break;
                j--;
                k++;
            }
            if (oddPalindrome) {
                oddPalindrome = !oddPalindrome;
            } else {
                i++;
                oddPalindrome = !oddPalindrome;
            }
        }
        return longestPalindrome;
    }
}
