public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int res = 0;
        int[] arr = new int[123];
        int oddIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c]++;
            if (oddIndex == -1 && arr[c] == 1)
                oddIndex = c;
            if (arr[c] > 1) {
                arr[c] = 0;
                res += 2;
                if (oddIndex == c) {
                    oddIndex = -1;
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] == 1)
                            oddIndex = j;
                    }
                }
            }
        }
        if (res % 2 == 0 && oddIndex != -1)
            res++;
        return res;
    }
}
