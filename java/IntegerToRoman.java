class IntegerToRoman {
	public String intToRoman(int num) {
		String result = "";
		String[] numerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		for (int i = 0; i < values.length;) {
			if (num - values[i] >= 0) {
				num -= values[i];
				result += numerals[i];
			} else
				i++;
		}
		return result;
	}
}