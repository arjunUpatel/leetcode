class RomanTointeger {
	public int romanToInt(String s) {
		int result = 0;
		String[] numerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		for (int i = 0, j = 0; i < s.length() && j < numerals.length;) {
			if (i + numerals[j].length() > s.length() || !s.substring(i, i + numerals[j].length()).equals(numerals[j]))
				j++;
			else {
				result += values[j];
				i += numerals[j].length();
			}
		}
		return result;
	}
}