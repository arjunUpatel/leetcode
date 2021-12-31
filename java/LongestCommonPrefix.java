public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		int j = -1;
		boolean isEqual = true;
		if (strs.length == 0)
			return "";
		do {
			j++;
			for (int i = 0; i < strs.length; i++) {
				try {
					if (strs[0].charAt(j) != strs[i].charAt(j)) {
						isEqual = false;
						break;
					}
				} catch (StringIndexOutOfBoundsException e) {
					isEqual = false;
					break;
				}
			}
		} while (j <= 200 && isEqual);
		return j > 0 ? strs[0].substring(0, j) : "";
	}
}