public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end) {
            if (!isAlphaNumeric(s.charAt(start)))
                start++;
            else if (!isAlphaNumeric(s.charAt(end)))
                end--;
            else if (toLowerCase(s.charAt(start)) != toLowerCase(s.charAt(end)))
                return false;
            else {
                start++;
                end--;
            }
        }
        return true;
    }

    public boolean isAlphaNumeric(char c) {
        if ((c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122))
            return true;
        return false;
    }

    public char toLowerCase(char c) {
        if (c >= 65 && c <= 90)
            c += 32;
        return c;
    }
}
