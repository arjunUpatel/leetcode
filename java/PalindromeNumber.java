public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		String str = "" + x;
		int front = 0, end = str.length() - 1;
		while (front < end) {
			if (str.charAt(front) != str.charAt(end))
				return false;
			front++;
			end--;
		}
		return true;
	}
}
